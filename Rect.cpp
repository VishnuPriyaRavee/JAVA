struct Rect
{
    Rect(int x1, int x2, int y1, int y2)
    : x1(x1), x2(x2), y1(y1), y2(y2)
    {
        assert(x1 < x2);
        assert(y1 < y2);
    }

    int x1, x2, y1, y2;
};

bool
overlap(const Rect &r1, const Rect &r2)
{
    bool noOverlap = r1.x1 > r2.x2 ||
                     r2.x1 > r1.x2 ||
                     r1.y1 > r2.y2 ||
                     r2.y1 > r1.y2;

    return !noOverlap;
}
