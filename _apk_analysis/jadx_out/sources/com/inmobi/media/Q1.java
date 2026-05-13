package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import com.inmobi.media.Q1;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class Q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f26157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioAttributes f26158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioFocusRequest f26159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f26160f;

    public Q1(Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        Context applicationContext = context.getApplicationContext();
        tn.p.j(applicationContext, "getApplicationContext(...)");
        this.f26155a = applicationContext;
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();
        tn.p.j(audioAttributesBuild, "build(...)");
        this.f26158d = audioAttributesBuild;
    }

    public static final void a(Q1 q12, int i10) {
        P1 p12;
        P1 p13;
        WeakReference weakReference;
        P1 p14;
        if (i10 == -2) {
            q12.f26156b = true;
            WeakReference weakReference2 = q12.f26157c;
            if (weakReference2 == null || (p12 = (P1) weakReference2.get()) == null) {
                return;
            }
            p12.a();
            return;
        }
        if (i10 == -1) {
            q12.f26156b = false;
            WeakReference weakReference3 = q12.f26157c;
            if (weakReference3 == null || (p13 = (P1) weakReference3.get()) == null) {
                return;
            }
            p13.a();
            return;
        }
        if (i10 != 1) {
            return;
        }
        if (q12.f26156b && (weakReference = q12.f26157c) != null && (p14 = (P1) weakReference.get()) != null) {
            p14.b();
        }
        q12.f26156b = false;
    }

    public final void a() {
        this.f26156b = false;
        Object systemService = this.f26155a.getSystemService("audio");
        AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                AudioFocusRequest audioFocusRequest = this.f26159e;
                if (audioFocusRequest != null) {
                    audioManager.abandonAudioFocusRequest(audioFocusRequest);
                    return;
                }
                return;
            }
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f26160f;
            if (onAudioFocusChangeListener != null) {
                audioManager.abandonAudioFocus(onAudioFocusChangeListener);
            }
        }
    }

    public final AudioManager.OnAudioFocusChangeListener b() {
        return new AudioManager.OnAudioFocusChangeListener() { // from class: n9.w3
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i10) {
                Q1.a(this.f75668b, i10);
            }
        };
    }

    public final void c() {
        WeakReference weakReference = this.f26157c;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f26157c = null;
        a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f26159e = null;
        }
        this.f26160f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f26155a
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            boolean r1 = r0 instanceof android.media.AudioManager
            if (r1 == 0) goto Lf
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            goto L10
        Lf:
            r0 = 0
        L10:
            r1 = 0
            if (r0 == 0) goto L62
            android.media.AudioManager$OnAudioFocusChangeListener r2 = r5.f26160f
            if (r2 != 0) goto L1d
            android.media.AudioManager$OnAudioFocusChangeListener r2 = r5.b()
            r5.f26160f = r2
        L1d:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 2
            if (r2 < r3) goto L5a
            android.media.AudioFocusRequest r2 = r5.f26159e
            if (r2 != 0) goto L51
            android.media.AudioFocusRequest$Builder r2 = new android.media.AudioFocusRequest$Builder
            r2.<init>(r4)
            android.media.AudioAttributes r3 = r5.f26158d
            android.media.AudioFocusRequest$Builder r2 = r2.setAudioAttributes(r3)
            android.media.AudioManager$OnAudioFocusChangeListener r3 = r5.f26160f
            tn.p.h(r3)
            bn.g r4 = com.inmobi.media.AbstractC3627o6.f27756e
            java.lang.Object r4 = r4.getValue()
            com.inmobi.media.Wb r4 = (com.inmobi.media.Wb) r4
            android.os.Handler r4 = r4.f26536a
            android.media.AudioFocusRequest$Builder r2 = r2.setOnAudioFocusChangeListener(r3, r4)
            android.media.AudioFocusRequest r2 = r2.build()
            java.lang.String r3 = "build(...)"
            tn.p.j(r2, r3)
            r5.f26159e = r2
        L51:
            android.media.AudioFocusRequest r2 = r5.f26159e
            if (r2 == 0) goto L62
            int r0 = androidx.media.b.a(r0, r2)
            goto L63
        L5a:
            android.media.AudioManager$OnAudioFocusChangeListener r2 = r5.f26160f
            r3 = 3
            int r0 = r0.requestAudioFocus(r2, r3, r4)
            goto L63
        L62:
            r0 = r1
        L63:
            r2 = 1
            if (r0 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Q1.d():boolean");
    }
}
