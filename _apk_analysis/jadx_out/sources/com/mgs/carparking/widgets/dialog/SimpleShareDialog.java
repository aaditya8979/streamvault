package com.mgs.carparking.widgets.dialog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.internal.view.SupportMenu;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.ExtensionShareEntry;
import com.safedk.android.utils.Logger;
import ed.e0;
import ed.j0;
import ed.l0;
import ed.o;

/* JADX INFO: loaded from: classes9.dex */
public class SimpleShareDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinearLayout f45236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f45237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f45238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExtensionShareEntry f45239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bitmap f45240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f45241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f45243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public sd.d f45247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Activity f45248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f45249o;

    public class a extends SimpleTarget<Bitmap> {
        public a() {
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) throws Throwable {
            SimpleShareDialog.this.f45240f = bitmap;
            SimpleShareDialog.this.f45242h = true;
            if (SimpleShareDialog.this.f45243i && SimpleShareDialog.this.f45247m != null && SimpleShareDialog.this.f45247m.isShowing()) {
                SimpleShareDialog.this.f45247m.f79650d.stop();
                SimpleShareDialog.this.f45247m.dismiss();
                if (SimpleShareDialog.this.f45244j) {
                    e0.d(SimpleShareDialog.this.f45249o, SimpleShareDialog.m(SimpleShareDialog.this.f45240f, SimpleShareDialog.this.f45241g), 2);
                } else if (SimpleShareDialog.this.f45245k) {
                    e0.d(SimpleShareDialog.this.f45249o, SimpleShareDialog.m(SimpleShareDialog.this.f45240f, SimpleShareDialog.this.f45241g), 1);
                } else if (SimpleShareDialog.this.f45246l) {
                    o.c(SimpleShareDialog.this.f45248n, SimpleShareDialog.m(SimpleShareDialog.this.f45240f, SimpleShareDialog.this.f45241g));
                }
            }
            Log.i("wangyi", "加载完成1");
        }
    }

    public SimpleShareDialog(Activity activity, Context context, ExtensionShareEntry extensionShareEntry) {
        super(context, R.style.dialog_center);
        requestWindowFeature(1);
        this.f45248n = activity;
        this.f45249o = context;
        this.f45239e = extensionShareEntry;
    }

    public static Bitmap m(Bitmap bitmap, Bitmap bitmap2) {
        String str;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        bitmap2.getWidth();
        bitmap2.getHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        if (zp.o.b(l0.Z())) {
            str = "官网地址: http://dg10.tv";
        } else {
            str = "官网地址: " + l0.Z();
        }
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setTextSize(40.0f);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap2, 122.0f, 1478.0f, (Paint) null);
        canvas.drawText(str, 250.0f, 40.0f, paint);
        canvas.drawText(str, 420.0f, 1725.0f, paint);
        canvas.save();
        canvas.restore();
        return bitmapCreateBitmap;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity activity, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        activity.startActivity(intent);
    }

    public final void n(View view) {
        this.f45238d = (TextView) view.findViewById(R.id.tv_cancel);
        this.f45236b = (LinearLayout) view.findViewById(R.id.ll_copyUrl);
        this.f45237c = (LinearLayout) view.findViewById(R.id.ll_savePhoto);
        this.f45238d.setOnClickListener(this);
        this.f45236b.setOnClickListener(this);
        this.f45237c.setOnClickListener(this);
    }

    public final void o() {
        getWindow().setGravity(80);
        getWindow().getWindowManager();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        getWindow().setAttributes(attributes);
        setCancelable(true);
        setCanceledOnTouchOutside(true);
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.ll_copyUrl) {
            if (this.f45239e != null) {
                ed.e.c(this.f45239e.getApp_share_url() + "");
                dismiss();
                return;
            }
            return;
        }
        if (id2 != R.id.ll_savePhoto) {
            if (id2 != R.id.tv_cancel) {
                return;
            }
            dismiss();
            return;
        }
        this.f45244j = false;
        this.f45245k = false;
        this.f45246l = true;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SENDTO");
        intent.setData(Uri.parse("smsto:"));
        intent.putExtra("sms_body", this.f45239e.getApp_share_url() + "");
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533((Activity) this.f45249o, intent);
        dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f45249o, R.layout.dialog_simple_share, null);
        n(viewGroup);
        setContentView(viewGroup);
        o();
        if (!zp.o.b(this.f45239e.getWx_app_url())) {
            this.f45241g = hh.a.a(this.f45239e.getWx_app_url(), j0.a(this.f45249o, 80.0f), j0.a(this.f45249o, 80.0f), BitmapFactory.decodeResource(this.f45249o.getResources(), R.mipmap.ic_launcher));
            this.f45243i = true;
        }
        Glide.with(this.f45249o).asBitmap().load(this.f45239e.getShare_pic_url()).into(new a());
    }
}
