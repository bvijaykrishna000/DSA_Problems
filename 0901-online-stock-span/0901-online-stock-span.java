class StockSpanner {

    Deque<Integer> prices = new ArrayDeque<>();
    Deque<Integer> spans = new ArrayDeque<>();

    public int next(int price) {
        int span = 1;

        while (!prices.isEmpty() && prices.peek() <= price) {
            prices.pop();
            span += spans.pop();
        }

        prices.push(price);
        spans.push(span);

        return span;
    }
}