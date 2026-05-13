package com.mgs.carparking.widgets.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VideoShareDataEntry;
import com.safedk.android.utils.Logger;
import zp.p;
import zp.r;

/* JADX INFO: loaded from: classes4.dex */
public class ShareDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f45225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f45226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f45227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecommandVideosEntity f45228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VideoShareDataEntry f45229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f45230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45232i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45233j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public sd.d f45234k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f45235l;

    public ShareDialog(Context context, sd.d dVar, RecommandVideosEntity recommandVideosEntity, VideoShareDataEntry videoShareDataEntry, int i10, int i11) {
        super(context, R.style.dialog_center);
        requestWindowFeature(1);
        this.f45235l = context;
        this.f45234k = dVar;
        this.f45228e = recommandVideosEntity;
        this.f45229f = videoShareDataEntry;
        this.f45230g = i10;
        this.f45231h = i11;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity activity, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        activity.startActivity(intent);
    }

    public final void b(View view) {
        this.f45225b = (LinearLayout) view.findViewById(R.id.ll_wx);
        this.f45226c = (LinearLayout) view.findViewById(R.id.ll_pyq);
        this.f45227d = (TextView) view.findViewById(R.id.tv_cancel);
        this.f45225b.setOnClickListener(this);
        this.f45226c.setOnClickListener(this);
        this.f45227d.setOnClickListener(this);
    }

    public final void c() {
        getWindow().setGravity(80);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCancelable(true);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.ll_pyq) {
            if (!tp.b.a(this.f45235l)) {
                p.b(r.b().getResources().getString(R.string.str_no_net));
                return;
            }
            this.f45233j = true;
            this.f45232i = false;
            ed.e.c(this.f45229f.getApp_share_url());
            dismiss();
            return;
        }
        if (id2 != R.id.ll_wx) {
            if (id2 != R.id.tv_cancel) {
                return;
            }
            dismiss();
        } else {
            if (!tp.b.a(this.f45235l)) {
                p.b(r.b().getResources().getString(R.string.str_no_net));
                return;
            }
            this.f45232i = true;
            this.f45233j = false;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SENDTO");
            intent.setData(Uri.parse("smsto:"));
            intent.putExtra("sms_body", this.f45229f.getApp_share_url());
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533((Activity) this.f45235l, intent);
            dismiss();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f45235l, R.layout.dialog_share, null);
        b(viewGroup);
        setContentView(viewGroup);
        c();
    }
}
