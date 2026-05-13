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
import com.mgs.carparking.widgets.dialog.VarietyLandAdapter;
import ic.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import zp.r;

/* JADX INFO: compiled from: VideoDetailLandVarietySetNumPop.java */
/* JADX INFO: loaded from: classes9.dex */
public class e extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f45430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f45431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VarietyLandAdapter f45432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<VideoBean> f45433d;

    /* JADX INFO: compiled from: VideoDetailLandVarietySetNumPop.java */
    public class a implements VarietyLandAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f45434a;

        public a(List list) {
            this.f45434a = list;
        }

        @Override // com.mgs.carparking.widgets.dialog.VarietyLandAdapter.c
        public void a(int i10) {
            e.this.dismiss();
            int i11 = 0;
            for (int i12 = 0; i12 < this.f45434a.size(); i12++) {
                if (((VideoBean) e.this.f45433d.get(i10)).getCollection() == ((VideoBean) this.f45434a.get(i12)).getCollection()) {
                    i11 = i12;
                }
            }
            e eVar = e.this;
            eVar.f45432c.g(eVar.f45433d, i10);
            op.a.a().b(new f0(i11));
        }
    }

    /* JADX INFO: compiled from: VideoDetailLandVarietySetNumPop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (e.this.f45431b.isEnabled()) {
                e.this.f45431b.setEnabled(false);
                e.this.f45431b.setText(r.b().getResources().getString(R.string.str_order));
            } else {
                e.this.f45431b.setEnabled(true);
                e.this.f45431b.setText(r.b().getResources().getString(R.string.str_reverse_order));
            }
            Collections.reverse(e.this.f45433d);
            e.this.f45432c.notifyDataSetChanged();
            e.this.f45430a.scrollToPosition(0);
        }
    }

    public e(Context context, List<VideoBean> list, String str, String str2, int i10) {
        super(context);
        this.f45433d = new ArrayList();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_variety_land_set_num, (ViewGroup) null);
        this.f45430a = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f45431b = (TextView) viewInflate.findViewById(R.id.tv_sort);
        this.f45430a.setLayoutManager(new LinearLayoutManager(context));
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (i10 == i11) {
                list.get(i11).setCheck(true);
            } else {
                list.get(i11).setCheck(false);
            }
        }
        this.f45433d.addAll(list);
        VarietyLandAdapter varietyLandAdapter = new VarietyLandAdapter(context, this.f45433d, str);
        this.f45432c = varietyLandAdapter;
        this.f45430a.setAdapter(varietyLandAdapter);
        this.f45430a.scrollToPosition(i10);
        this.f45432c.f(new a(list));
        viewInflate.findViewById(R.id.ll_sort).setOnClickListener(new b());
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
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
