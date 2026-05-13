package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.mgs.carparking.widgets.dialog.cling.DeviceAdapter;
import ed.v;
import r0.o;

/* JADX INFO: loaded from: classes2.dex */
public class ClingDeviceDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f45180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f45181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VideoPlayDetailActivity f45182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DeviceAdapter f45183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f45184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f45185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f45186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f45187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f45188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f45189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qb.a f45190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public r0.l f45191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public qr.a<?, ?, ?> f45192n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f45193o;

    public class a implements DeviceAdapter.a {

        /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.ClingDeviceDialog$a$a, reason: collision with other inner class name */
        public class C0541a implements o {
            public C0541a() {
            }

            @Override // r0.o
            public void a(@NonNull qr.a<?, ?, ?> aVar) {
                Log.e("DLNACastManager", "onDisconnected");
                ClingDeviceDialog.this.i();
            }

            @Override // r0.o
            public void b(@NonNull ds.b<?> bVar) {
                Log.e("DLNACastManager", "onEventChanged");
            }

            @Override // r0.o
            public void c(@NonNull qr.a<?, ?, ?> aVar) {
                Log.e("DLNACastManager", "onConnected");
                ClingDeviceDialog clingDeviceDialog = ClingDeviceDialog.this;
                b bVar = clingDeviceDialog.f45193o;
                if (bVar != null) {
                    bVar.a(clingDeviceDialog.f45191m, aVar);
                }
            }
        }

        public a() {
        }

        @Override // com.mgs.carparking.widgets.dialog.cling.DeviceAdapter.a
        public void a() {
            Log.e("onDeviceAdded", "onItemAdd ");
            ClingDeviceDialog.this.f45181c.setVisibility(0);
            ClingDeviceDialog.this.f45184f.setVisibility(0);
            ClingDeviceDialog.this.f45188j.setVisibility(8);
            ClingDeviceDialog.this.f45185g.setVisibility(8);
        }

        @Override // com.mgs.carparking.widgets.dialog.cling.DeviceAdapter.a
        public void b(@NonNull qr.a<?, ?, ?> aVar) {
            ClingDeviceDialog.this.f45192n = aVar;
            q0.a aVar2 = q0.a.f77565b;
            if (aVar2.o(aVar)) {
                aVar2.j(aVar);
            }
            ClingDeviceDialog.this.f45191m = aVar2.i(aVar, new C0541a());
            ClingDeviceDialog.this.dismiss();
        }
    }

    public interface b {
        void a(r0.l lVar, qr.a<?, ?, ?> aVar);
    }

    public ClingDeviceDialog(Context context, VideoPlayDetailActivity videoPlayDetailActivity, qb.a aVar) {
        super(context, R.style.dialog_center);
        requestWindowFeature(1);
        this.f45180b = context;
        this.f45182d = videoPlayDetailActivity;
        this.f45190l = aVar;
    }

    public final void f(View view) {
        this.f45181c = (RecyclerView) view.findViewById(R.id.rv_list);
        this.f45185g = (LinearLayout) view.findViewById(R.id.llEmpty);
        this.f45184f = (TextView) view.findViewById(R.id.tv_tig);
        this.f45186h = (TextView) view.findViewById(R.id.tv_Cancel);
        this.f45187i = (TextView) view.findViewById(R.id.tv_help);
        this.f45188j = (LinearLayout) view.findViewById(R.id.ll_loading);
        this.f45189k = (ImageView) view.findViewById(R.id.iv_loading);
        this.f45186h.setOnClickListener(this);
        this.f45187i.setOnClickListener(this);
        ud.c.b(this.f45180b, R.drawable.ic_video_lelink_loading, this.f45189k, true);
        this.f45181c.setLayoutManager(new LinearLayoutManager(this.f45180b, 1, false));
        DeviceAdapter deviceAdapter = new DeviceAdapter(this.f45180b, new a());
        this.f45183e = deviceAdapter;
        q0.a.f77565b.p(deviceAdapter);
        if (pb.c.e().d().size() > 0) {
            this.f45181c.setVisibility(0);
            this.f45184f.setVisibility(0);
            this.f45188j.setVisibility(8);
            this.f45185g.setVisibility(8);
        }
        this.f45181c.setAdapter(this.f45183e);
    }

    public void g(b bVar) {
        this.f45193o = bVar;
    }

    public final void h() {
        getWindow().setGravity(80);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    public void i() {
        try {
            q0.a.f77565b.j(this.f45192n);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != R.id.tv_Cancel) {
            return;
        }
        if (rb.a.c().f() != null) {
            rb.a.c().d().t(this.f45190l);
        }
        dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f45180b, R.layout.dialog_cling_device, null);
        f(viewGroup);
        setContentView(viewGroup);
        h();
        if (v.a(this.f45180b) == -1 || v.a(this.f45180b) == 1) {
            this.f45188j.setVisibility(8);
            this.f45185g.setVisibility(0);
        }
    }
}
