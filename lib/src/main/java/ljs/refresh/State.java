package ljs.refresh;

enum State {
    /**
     * 什么都没做
     */
    NoThing(0),
    /**
     * 正在拖拽,手指未离开屏幕(未触发拖拽至底部自动刷新)
     */
    Draging(1),
    /**
     * 正在刷新
     */
    Refreshing(2);
    public int value;

    State(int value) {
        this.value = value;
    }
}
