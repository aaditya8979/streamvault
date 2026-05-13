package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.VideoBean;
import com.mgs.carparking.widgets.dialog.TvAndComicLandAdapter;
import com.mgs.carparking.widgets.rv.HorizontalItemFourDecoration;
import ic.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zp.o;
import zp.r;

/* JADX INFO: compiled from: VideoDetailLandTvAndComicSetNumPop.java */
/* JADX INFO: loaded from: classes9.dex */
public class d extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f45393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f45394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TvAndComicLandAdapter f45395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<VideoBean> f45396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<VideoBean> f45397e;

    /* JADX INFO: compiled from: VideoDetailLandTvAndComicSetNumPop.java */
    public class a implements TvAndComicLandAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f45398a;

        public a(List list) {
            this.f45398a = list;
        }

        @Override // com.mgs.carparking.widgets.dialog.TvAndComicLandAdapter.c
        public void a(int i10) {
            d.this.dismiss();
            if (o.b(((VideoBean) d.this.f45397e.get(i10)).getVod_url())) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f45398a.size(); i12++) {
                if (((VideoBean) d.this.f45397e.get(i10)).getCollection() == ((VideoBean) this.f45398a.get(i12)).getCollection()) {
                    i11 = i12;
                }
            }
            d dVar = d.this;
            dVar.f45395c.h(dVar.f45397e, i10);
            op.a.a().b(new f0(i11));
        }
    }

    /* JADX INFO: compiled from: VideoDetailLandTvAndComicSetNumPop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (d.this.f45394b.isEnabled()) {
                d.this.f45394b.setEnabled(false);
                d.this.f45394b.setText(r.b().getResources().getString(R.string.str_order));
            } else {
                d.this.f45394b.setEnabled(true);
                d.this.f45394b.setText(r.b().getResources().getString(R.string.str_reverse_order));
            }
            Collections.reverse(d.this.f45397e);
            d.this.f45395c.notifyDataSetChanged();
            d.this.f45393a.scrollToPosition(0);
        }
    }

    public d(Context context, List<VideoBean> list, int i10) {
        super(context);
        this.f45396d = new ArrayList();
        this.f45397e = new ArrayList();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_land_tv_set_num, (ViewGroup) null);
        this.f45393a = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f45394b = (TextView) viewInflate.findViewById(R.id.tv_sort);
        this.f45393a.setLayoutManager(new GridLayoutManager(context, 4));
        this.f45393a.addItemDecoration(new HorizontalItemFourDecoration((int) context.getResources().getDimension(R.dimen.dp_2), context));
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        this.f45397e.addAll(list);
        TvAndComicLandAdapter tvAndComicLandAdapter = new TvAndComicLandAdapter(context, this.f45396d);
        this.f45395c = tvAndComicLandAdapter;
        this.f45393a.setAdapter(tvAndComicLandAdapter);
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
        this.f45395c.h(this.f45397e, i10);
        this.f45393a.scrollToPosition(i10);
        this.f45395c.g(new a(list));
        viewInflate.findViewById(R.id.ll_sort).setOnClickListener(new b());
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
