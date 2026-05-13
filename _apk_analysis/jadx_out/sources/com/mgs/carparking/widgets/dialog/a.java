package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.widgets.dialog.ClingDeviceDialog;
import com.mgs.carparking.widgets.dialog.cling.DeviceAdapter;
import ed.v;
import r0.o;

/* JADX INFO: compiled from: ClingDeviceHorizalPop.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends PopupWindow implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f45348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VideoPlayDetailActivity f45349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DeviceAdapter f45350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f45351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f45352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f45353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f45354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f45355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ClingDeviceDialog.b f45356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public qb.a f45357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r0.l f45358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public qr.a<?, ?, ?> f45359m;

    /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ClingDeviceHorizalPop.java */
    public class C0542a implements DeviceAdapter.a {

        /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ClingDeviceHorizalPop.java */
        public class C0543a implements o {
            public C0543a() {
            }

            @Override // r0.o
            public void a(@NonNull qr.a<?, ?, ?> aVar) {
                Log.e("DLNACastManager", "onDisconnected");
                a.this.f();
            }

            @Override // r0.o
            public void b(@NonNull ds.b<?> bVar) {
                Log.e("DLNACastManager", "onEventChanged");
            }

            @Override // r0.o
            public void c(@NonNull qr.a<?, ?, ?> aVar) {
                Log.e("DLNACastManager", "onConnected");
                a aVar2 = a.this;
                ClingDeviceDialog.b bVar = aVar2.f45356j;
                if (bVar != null) {
                    bVar.a(aVar2.f45358l, aVar);
                }
            }
        }

        public C0542a() {
        }

        @Override // com.mgs.carparking.widgets.dialog.cling.DeviceAdapter.a
        public void a() {
            Log.e("onDeviceAdded", "onItemAdd ");
            a.this.f45351e.setVisibility(0);
            a.this.f45352f.setVisibility(0);
            a.this.f45354h.setVisibility(8);
            a.this.f45353g.setVisibility(8);
        }

        @Override // com.mgs.carparking.widgets.dialog.cling.DeviceAdapter.a
        public void b(@NonNull qr.a<?, ?, ?> aVar) {
            a.this.f45359m = aVar;
            q0.a aVar2 = q0.a.f77565b;
            if (aVar2.o(aVar)) {
                aVar2.j(aVar);
            }
            a.this.f45358l = aVar2.i(aVar, new C0543a());
            a.this.dismiss();
        }
    }

    public a(VideoPlayDetailActivity videoPlayDetailActivity, Context context, qb.a aVar) {
        super(context);
        this.f45349c = videoPlayDetailActivity;
        this.f45348b = context;
        this.f45357k = aVar;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_cling_device_horizal, (ViewGroup) null);
        this.f45351e = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f45353g = (LinearLayout) viewInflate.findViewById(R.id.llEmpty);
        this.f45352f = (TextView) viewInflate.findViewById(R.id.tv_tig);
        this.f45354h = (LinearLayout) viewInflate.findViewById(R.id.ll_loading);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_loading);
        this.f45355i = imageView;
        ud.c.b(context, R.drawable.ic_video_lelink_loading, imageView, true);
        this.f45351e.setLayoutManager(new LinearLayoutManager(context, 1, false));
        DeviceAdapter deviceAdapter = new DeviceAdapter(context, new C0542a());
        this.f45350d = deviceAdapter;
        q0.a.f77565b.p(deviceAdapter);
        if (pb.c.e().d().size() > 0) {
            this.f45351e.setVisibility(0);
            this.f45352f.setVisibility(0);
            this.f45354h.setVisibility(8);
            this.f45353g.setVisibility(8);
        }
        this.f45351e.setAdapter(this.f45350d);
        if (v.a(context) == -1 || v.a(context) == 1) {
            this.f45354h.setVisibility(8);
            this.f45353g.setVisibility(0);
        }
        if (rb.a.c().f() != null) {
            rb.a.c().d().n(aVar);
        }
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
    }

    public void e(ClingDeviceDialog.b bVar) {
        this.f45356j = bVar;
    }

    public void f() {
        try {
            q0.a.f77565b.j(this.f45359m);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        view.getId();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }
}
