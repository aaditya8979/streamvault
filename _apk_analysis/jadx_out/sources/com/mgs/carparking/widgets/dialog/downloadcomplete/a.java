package com.mgs.carparking.widgets.dialog.downloadcomplete;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.dbtable.VideoDownloadEntity;
import com.mgs.carparking.widgets.dialog.downloadcomplete.TvAndComicLandDownnloadAdapter;
import com.mgs.carparking.widgets.rv.HorizontalItemFourDecoration;
import ic.f0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: VideoCompleteLandTvAndComicSetNumPop.java */
/* JADX INFO: loaded from: classes9.dex */
public class a extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f45421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TvAndComicLandDownnloadAdapter f45422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<VideoDownloadEntity> f45423c;

    /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.downloadcomplete.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VideoCompleteLandTvAndComicSetNumPop.java */
    public class C0546a implements TvAndComicLandDownnloadAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f45424a;

        public C0546a(List list) {
            this.f45424a = list;
        }

        @Override // com.mgs.carparking.widgets.dialog.downloadcomplete.TvAndComicLandDownnloadAdapter.c
        public void a(int i10) {
            a.this.f45422b.g(this.f45424a, i10);
            op.a.a().b(new f0(i10));
            a.this.dismiss();
        }
    }

    public a(Context context, List<VideoDownloadEntity> list, int i10) {
        super(context);
        this.f45423c = new ArrayList();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_land_tv_set_num, (ViewGroup) null);
        viewInflate.findViewById(R.id.ll_sort).setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f45421a = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 4));
        this.f45421a.addItemDecoration(new HorizontalItemFourDecoration((int) context.getResources().getDimension(R.dimen.dp_2), context));
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        TvAndComicLandDownnloadAdapter tvAndComicLandDownnloadAdapter = new TvAndComicLandDownnloadAdapter(context, this.f45423c);
        this.f45422b = tvAndComicLandDownnloadAdapter;
        this.f45421a.setAdapter(tvAndComicLandDownnloadAdapter);
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.translucent));
        getContentView().setSystemUiVisibility(5894);
        viewInflate.measure(0, 0);
        setSoftInputMode(3);
        update();
        this.f45422b.g(list, i10);
        this.f45421a.scrollToPosition(i10);
        this.f45422b.f(new C0546a(list));
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
