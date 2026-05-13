package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.ironsource.InterfaceC4285ua;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4091ja extends WebView implements InterfaceC4302va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC4285ua f32070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Qc f32071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4091ja(@NotNull Context context) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4091ja(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(attributeSet, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4091ja(@NotNull Context context, @NotNull AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(attributeSet, "attrs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4091ja(@NotNull Context context, @NotNull InterfaceC4285ua interfaceC4285ua) {
        this(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(interfaceC4285ua, "javascriptEngine");
        this.f32070a = interfaceC4285ua;
    }

    public /* synthetic */ C4091ja(Context context, InterfaceC4285ua interfaceC4285ua, int i10, tn.i iVar) {
        this(context, (i10 & 2) != 0 ? new InterfaceC4285ua.a(0, 1, null) : interfaceC4285ua);
    }

    public final void a() {
        this.f32071b = null;
    }

    public final void a(@Nullable Qc qc2) {
        this.f32071b = qc2;
    }

    @Override // com.ironsource.InterfaceC4302va
    public void a(@NotNull String str) {
        tn.p.k(str, "script");
        InterfaceC4285ua interfaceC4285ua = this.f32070a;
        InterfaceC4285ua interfaceC4285ua2 = null;
        if (interfaceC4285ua == null) {
            tn.p.C("javascriptEngine");
            interfaceC4285ua = null;
        }
        if (!interfaceC4285ua.a()) {
            InterfaceC4285ua interfaceC4285ua3 = this.f32070a;
            if (interfaceC4285ua3 == null) {
                tn.p.C("javascriptEngine");
                interfaceC4285ua3 = null;
            }
            interfaceC4285ua3.a(this);
        }
        InterfaceC4285ua interfaceC4285ua4 = this.f32070a;
        if (interfaceC4285ua4 == null) {
            tn.p.C("javascriptEngine");
        } else {
            interfaceC4285ua2 = interfaceC4285ua4;
        }
        interfaceC4285ua2.a(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53132f, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, @NotNull KeyEvent keyEvent) {
        Qc qc2;
        tn.p.k(keyEvent, "event");
        if (i10 == 4 && (qc2 = this.f32071b) != null && qc2.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
