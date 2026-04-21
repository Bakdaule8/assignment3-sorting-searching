class Experiment {

    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    long measureSortTime(int[] arr, String type) {
        long start = System.nanoTime();

        if (type.equals("basic"))
            sorter.basicSort(arr);
        else
            sorter.advancedSort(arr);

        long end = System.nanoTime();
        return end - start;
    }

    long measureSearchTime(int[] arr, int target) {
        long start = System.nanoTime();
        searcher.search(arr, target);
        long end = System.nanoTime();
        return end - start;
    }

    void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            int[] arr = sorter.generateRandomArray(size);

            int[] arrCopy1 = arr.clone();
            int[] arrCopy2 = arr.clone();

            long t1 = measureSortTime(arrCopy1, "basic");
            long t2 = measureSortTime(arrCopy2, "advanced");

            System.out.println("Size: " + size);
            System.out.println("Bubble: " + t1);
            System.out.println("Merge: " + t2);

            sorter.advancedSort(arr); // sort for binary search

            long t3 = measureSearchTime(arr, arr[size/2]);

            System.out.println("Binary search: " + t3);
            System.out.println("-------------------");
        }
    }
}