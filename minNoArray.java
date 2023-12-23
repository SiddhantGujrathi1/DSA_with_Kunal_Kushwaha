static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (min > i)
                min = i;
        }
        return min;
    }
