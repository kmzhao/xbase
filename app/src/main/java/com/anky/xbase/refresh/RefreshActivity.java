package com.anky.xbase.refresh;


import com.anky.xbase.base.BaseActivity;

/**
 * @author: Anky
 * @time: 2018
 * @desc:
 */

public class RefreshActivity extends BaseActivity {
    @Override
    protected void initView() {

    }
//    private SwipeMenuRecyclerView rv_swipe;
//    @Override
//    protected void initView() {
//        setContentView(R.layout.activity_refresh);
//        List<MyBean> datas=new ArrayList<>();
//        for (int i=0;i<30;i++){
//            datas.add(new MyBean("位置"+(i+1)));
//        }
//        rv_swipe=findViewById(R.id.recycler);
//        rv_swipe.setLayoutManager(new LinearLayoutManager(this));
//        MyAdapter mAdapter=new MyAdapter(this,datas);
//        rv_swipe.setSwipeMenuCreator(swipeMenuCreator);
//        rv_swipe.setSwipeMenuItemClickListener(this);
//        rv_swipe.addItemDecoration(createItemDecoration());
//        rv_swipe.setSwipeItemClickListener(this);
////        mRefresh.setOnRefreshListener(this);
//        rv_swipe.useDefaultLoadMore();
////        rv_swipe.setLoadMoreListener(this);
//        rv_swipe.setLoadMoreListener(new SwipeMenuRecyclerView.LoadMoreListener() {
//            @Override
//            public void onLoadMore() {
//                show("hello , more...");
//            }
//        });
//        rv_swipe.setAdapter(mAdapter);
//
//    }
//
//    protected RecyclerView.ItemDecoration createItemDecoration() {
//        return new DefaultItemDecoration(ContextCompat.getColor(this, R.color.form_divide_plus_color), getWidth(), getDividerplus());
//    }
//
//    public int getDividerplus() {
//        DisplayMetrics displayMetrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        int heightPixels = displayMetrics.heightPixels;
//        return (int) (30.0 / 1920 * heightPixels);
//    }
//    private SwipeMenuCreator swipeMenuCreator = (swipeLeftMenu, swipeRightMenu, viewType) -> {
//            int width = getWidth() / 5;
//        int height = ViewGroup.LayoutParams.MATCH_PARENT;
//        {
//            SwipeMenuItem addItem = new SwipeMenuItem(this)
//                    .setBackground(R.drawable.selector_red)
//                    .setText("删除")
//                    .setTextColor(Color.WHITE)
//                    .setWidth(width)
//                    .setHeight(height);
//            swipeRightMenu.addMenuItem(addItem); // 添加菜单到右侧。
//        }
//    };
//    public int getWidth() {
//        DisplayMetrics displayMetrics = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
//        return displayMetrics.widthPixels;
//    }
//
//
//
//
//    @Override
//    public void onItemClick(View itemView, int position) {
//        show("The current item pos is "+position);
//    }
//
//    @Override
//    public void onItemClick(SwipeMenuBridge menuBridge) {
//        menuBridge.closeMenu();
//        int direction = menuBridge.getDirection(); // 左侧还是右侧菜单。
//        int adapterPosition = menuBridge.getAdapterPosition(); // RecyclerView的Item的position。
//        show("delete.");
//    }


}
