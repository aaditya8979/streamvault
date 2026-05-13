package com.mbridge.msdk.video.dynview.util.draw;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.shape.a;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ChoiceOneDrawBitBg.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a f41510d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f41511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f41512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bitmap f41513c;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChoiceOneDrawBitBg.java */
    public class RunnableC0520a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f41514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f41515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f41516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f41517d;

        /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.util.draw.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ChoiceOneDrawBitBg.java */
        public class RunnableC0521a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.b f41519a;

            public RunnableC0521a(a.b bVar) {
                this.f41519a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (a.this.f41511a == null || this.f41519a.build() == null) {
                    return;
                }
                a.this.f41511a.setBackground(this.f41519a.build());
            }
        }

        public RunnableC0520a(Bitmap bitmap, int i10, float f10, float f11) {
            this.f41514a = bitmap;
            this.f41515b = i10;
            this.f41516c = f10;
            this.f41517d = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap bitmapA = a0.a(this.f41514a, 10);
                Bitmap bitmapA2 = a0.a(this.f41514a, 10);
                a.b bVarA = com.mbridge.msdk.video.dynview.shape.a.a();
                bVarA.orientation(this.f41515b).b(bitmapA).a(bitmapA2);
                if (this.f41515b == 2) {
                    float f10 = this.f41516c;
                    float f11 = this.f41517d;
                    if (f10 > f11) {
                        bVarA.b(f10).a(this.f41517d);
                    } else {
                        bVarA.b(f11).a(this.f41516c);
                    }
                } else {
                    bVarA.b(this.f41516c).a(this.f41517d);
                }
                if (a.this.f41511a != null) {
                    a.this.f41511a.post(new RunnableC0521a(bVarA));
                }
            } catch (Exception e10) {
                q0.b("ChoiceOneDrawBitBg", e10.getMessage());
            }
        }
    }

    private a() {
    }

    public static a a() {
        a aVar;
        if (f41510d != null) {
            return f41510d;
        }
        synchronized (a.class) {
            if (f41510d == null) {
                f41510d = new a();
            }
            aVar = f41510d;
        }
        return aVar;
    }

    private synchronized void a(int i10, float f10, float f11, Bitmap bitmap, Bitmap bitmap2) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.a().execute(new RunnableC0520a(bitmap, i10, f10, f11));
        } catch (Exception e10) {
            q0.a("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }

    public void a(Map<String, Bitmap> map, c cVar, View view) {
        if (view == null || cVar == null || map == null || map.size() == 0 || map.size() < 2 || cVar.b() == null || cVar.b().size() < 2) {
            return;
        }
        this.f41511a = view;
        int iH = cVar.h();
        float fM = cVar.m();
        float fK = cVar.k();
        try {
            List<CampaignEx> listB = cVar.b();
            String md5 = listB.get(0) != null ? SameMD5.getMD5(listB.get(0).getImageUrl()) : "";
            String md52 = listB.get(1) != null ? SameMD5.getMD5(listB.get(1).getImageUrl()) : "";
            Bitmap bitmap = (TextUtils.isEmpty(md5) || !map.containsKey(md5)) ? null : map.get(md5);
            Bitmap bitmap2 = (TextUtils.isEmpty(md52) || !map.containsKey(md52)) ? null : map.get(md52);
            if (bitmap == null || bitmap.isRecycled() || bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            a(iH, fM, fK, bitmap, bitmap2);
        } catch (Exception e10) {
            q0.b("ChoiceOneDrawBitBg", e10.getMessage());
        }
    }

    public void b() {
        if (this.f41511a != null) {
            this.f41511a = null;
        }
        Bitmap bitmap = this.f41512b;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f41512b.recycle();
            this.f41512b = null;
        }
        Bitmap bitmap2 = this.f41513c;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.f41513c.recycle();
        this.f41513c = null;
    }
}
