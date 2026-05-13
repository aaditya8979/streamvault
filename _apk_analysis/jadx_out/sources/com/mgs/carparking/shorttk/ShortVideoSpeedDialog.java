package com.mgs.carparking.shorttk;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import com.dramarush.shortin.R;
import ed.l0;

/* JADX INFO: loaded from: classes7.dex */
public class ShortVideoSpeedDialog extends AppCompatDialog implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f44397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f44398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f44399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f44400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f44401f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f44402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f44403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f44404i;

    public interface a {
        void a(float f10);
    }

    public ShortVideoSpeedDialog(Context context) {
        super(context, R.style.dialog_center);
        requestWindowFeature(1);
        this.f44403h = context;
    }

    public final void b(View view) {
        this.f44397b = (TextView) view.findViewById(R.id.tv_speed_3);
        this.f44398c = (TextView) view.findViewById(R.id.tv_speed_2);
        this.f44399d = (TextView) view.findViewById(R.id.tv_speed_1_5);
        this.f44400e = (TextView) view.findViewById(R.id.tv_speed_1_2_5);
        this.f44402g = (TextView) view.findViewById(R.id.tv_speed_1);
        this.f44401f = (TextView) view.findViewById(R.id.tv_speed_0_75);
        if (l0.I() == 3.0d) {
            this.f44397b.setTextColor(this.f44403h.getResources().getColor(R.color.color_42BD56));
        } else if (l0.I() == 2.0d) {
            this.f44398c.setTextColor(this.f44403h.getResources().getColor(R.color.color_42BD56));
        } else if (l0.I() == 1.5d) {
            this.f44399d.setTextColor(this.f44403h.getResources().getColor(R.color.color_42BD56));
        } else if (l0.I() == 1.25d) {
            this.f44400e.setTextColor(this.f44403h.getResources().getColor(R.color.color_42BD56));
        } else if (l0.I() == 1.0d) {
            this.f44402g.setTextColor(this.f44403h.getResources().getColor(R.color.color_42BD56));
        } else {
            this.f44401f.setTextColor(this.f44403h.getResources().getColor(R.color.color_42BD56));
        }
        this.f44397b.setOnClickListener(this);
        this.f44398c.setOnClickListener(this);
        this.f44399d.setOnClickListener(this);
        this.f44400e.setOnClickListener(this);
        this.f44402g.setOnClickListener(this);
        this.f44401f.setOnClickListener(this);
    }

    public void c(a aVar) {
        this.f44404i = aVar;
    }

    public final void d() {
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
        switch (view.getId()) {
            case R.id.tv_speed_0_75 /* 2131363749 */:
                this.f44404i.a(0.75f);
                break;
            case R.id.tv_speed_1 /* 2131363750 */:
                this.f44404i.a(1.0f);
                break;
            case R.id.tv_speed_1_2_5 /* 2131363751 */:
                this.f44404i.a(1.25f);
                break;
            case R.id.tv_speed_1_5 /* 2131363752 */:
                this.f44404i.a(1.5f);
                break;
            case R.id.tv_speed_2 /* 2131363753 */:
                this.f44404i.a(2.0f);
                break;
            case R.id.tv_speed_3 /* 2131363754 */:
                this.f44404i.a(3.0f);
                break;
        }
        dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) View.inflate(this.f44403h, R.layout.dialog_short_speed, null);
        b(viewGroup);
        setContentView(viewGroup);
        d();
    }
}
