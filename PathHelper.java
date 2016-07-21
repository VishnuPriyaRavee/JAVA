private class PathHelper
{
    public int Value = 0;
    public List<int> Path = new List<int>();
}

public List<int> FindMaxPath(int[][] values)
{
    int n = values.Length;

    PathHelper[] prev = new PathHelper[n];
    PathHelper[] curr = null;
    for (int i = 0; i < n; i++)
    {
        prev[i] = new PathHelper();
        prev[i].Value = values[n - 1][i];
        prev[i].Path.Add(values[n - 1][i]);
    }

    for (int i = n - 2; i >= 0; i--)
    {
        int m = values[i].Length;
        curr = new PathHelper[m];

        for (int j = 0; j < m; j++)
        {
            curr[j] = new PathHelper();
            var max = (prev[j].Value > prev[j + 1].Value) ? prev[j] : prev[j + 1];
            curr[j].Value = values[i][j] + max.Value;
            curr[j].Path.Add(values[i][j]);
            curr[j].Path.AddRange(max.Path);
        }

        prev = curr;
    }

    return curr[0].Path;
}
