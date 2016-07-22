 private  pair( List players ) {

          List match = new LinkedList();

          if ( players.size() < 2 ) {
               return match;
          }

                   if ( round.getNumber() == 1 ) {
              
               Collections.shuffle( players );
               
             
               Collections.sort( players, new ResultsComp() );

            
               int size = (int) Math.pow( 2, Math.ceil( Math.log( players.size() ) / Math.log( 2 ) ) );

              
               Match match;
               Player p1, p2;
               int i1, i2;
               for ( int i = 0; i < size / 2; i++ ) {

                    i1 = i;
                    i2 = size - ( i + 1 );

                    p1 = (Player) players.get( i1 );
                    if ( i2 >= players.size() ) {
                         match = Match.randomBye( p1, round );
                    }
                    else {
                         p2 = (Player) players.get( i2 );
                         match = new Match( p1, p2, round );
                    }
                    match.add( match );
               }

               match = recursivePair( match );

               for ( int i = 0; i < match.size(); i++ ) {
                    match = (Match) match.get( i );

                    match.getPlayer1().setSeat( i * 2 );
                    if ( !match.isBye() ) {
                         match.getPlayer2().setSeat( i * 2 + 1 );
                    }
               }
          }
          else {
               Collections.sort( players, new SeatComp() );

               if ( players.size() % 2 == 1 ) {
                    match.add( Match.randomBye( (Player) players.remove( 0 ), round ) );
               }

               int size = players.size() / 2;
               for ( int i = 0; i < size; i++ ) {
                    match.add( new Match( (Player) players.get( i * 2 ), (Player) players.get( i * 2 + 1 ), round ) );
               }
          }
          
          return match;
     }

    
     private List recursivePair( List matches ) {

          if ( matches.size() <= 2 ) {
               List results = new LinkedList();
               results.add( matches.get( 0 ) );
               if ( matches.size() == 2 ) {
                    results.add( matches.get( 1 ) );
               }
               return results;
          }

          double exp = Math.log( matches.size() ) / Math.log( 2 );

          if ( Math.floor( exp ) != exp ) {
               return null;
          }

          int splitPoint = (int) Math.pow( 2, exp - 1 );
          List a = recursivePair( matches.subList( 0, splitPoint ) );
          List results2 = recursivePair( matches.subList( splitPoint, matches.size() ) );

          int insert = 1;
          for ( int i = 0; i < results2.size(); i += 2 ) {

               a.add( insert, results2.get( i ) );
               a.add( insert, results2.get( i + 1 ) );

               insert += 4;
          }

          return a;
     }
