package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.VideoBean;
import com.mgs.carparking.widgets.dialog.VarietyAdapter;
import ic.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zp.o;
import zp.r;

/* JADX INFO: compiled from: VideoDetailVarietySetNumPop.java */
/* JADX INFO: loaded from: classes9.dex */
public class k extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f45575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f45576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VarietyAdapter f45577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<VideoBean> f45578d;

    /* JADX INFO: compiled from: VideoDetailVarietySetNumPop.java */
    public class a implements VarietyAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f45579a;

        public a(List list) {
            this.f45579a = list;
        }

        @Override // com.mgs.carparking.widgets.dialog.VarietyAdapter.c
        public void a(int i10) {
            k.this.dismiss();
            if (o.b(((VideoBean) k.this.f45578d.get(i10)).getVod_url())) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f45579a.size(); i12++) {
                if (((VideoBean) k.this.f45578d.get(i10)).getCollection() == ((VideoBean) this.f45579a.get(i12)).getCollection()) {
                    i11 = i12;
                }
            }
            k kVar = k.this;
            kVar.f45577c.g(kVar.f45578d, i10);
            op.a.a().b(new f0(i11));
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietySetNumPop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailVarietySetNumPop.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (k.this.f45576b.isEnabled()) {
                k.this.f45576b.setEnabled(false);
                k.this.f45576b.setText(r.b().getResources().getString(R.string.str_order));
            } else {
                k.this.f45576b.setEnabled(true);
                k.this.f45576b.setText(r.b().getResources().getString(R.string.str_reverse_order));
            }
            Collections.reverse(k.this.f45578d);
            k.this.f45577c.notifyDataSetChanged();
            k.this.f45575a.scrollToPosition(0);
        }
    }

    public k(Context context, List<VideoBean> list, String str, String str2, int i10) {
        super(context);
        this.f45578d = new ArrayList();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_variety_set_num, (ViewGroup) null);
        this.f45575a = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f45576b = (TextView) viewInflate.findViewById(R.id.tv_sort);
        this.f45575a.setLayoutManager(new LinearLayoutManager(context));
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        this.f45578d.addAll(list);
        VarietyAdapter varietyAdapter = new VarietyAdapter(context, this.f45578d, str);
        this.f45577c = varietyAdapter;
        this.f45575a.setAdapter(varietyAdapter);
        this.f45575a.scrollToPosition(i10);
        this.f45577c.f(new a(list));
        viewInflate.findViewById(R.id.rl_top).setOnClickListener(new b());
        viewInflate.findViewById(R.id.ll_sort).setOnClickListener(new c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(R.style.pop_shop_anim);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background));
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
