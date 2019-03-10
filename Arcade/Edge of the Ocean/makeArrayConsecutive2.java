int makeArrayConsecutive2(Integer[] statues) {
    Arrays.sort(statues);
    int min = statues[0], max = statues[statues.length - 1];
    return (max-min) - statues.length + 1;
}
