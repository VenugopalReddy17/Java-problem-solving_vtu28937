class Task3_10
{
    public int AddSub(int input1, int input2)
    {
        int N = input1;
        int opt = input2;

        if (opt == 1)
        {
            
            return (N + 1) / 2;
        }
        else
        {
            
            if (N % 2 == 0)
            {
                return (3 * N) / 2;
            }
            else
            {
                return (3 * N - 1) / 2;
            }
        }
    }
}