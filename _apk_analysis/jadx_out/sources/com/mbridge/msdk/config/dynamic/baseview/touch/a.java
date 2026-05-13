package com.mbridge.msdk.config.dynamic.baseview.touch;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: TouchEventData.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f36600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f36601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f36602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f36603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f36604e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f36605f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f36606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f36607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f36608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f36609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f36610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f36612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f36614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<C0430a> f36615p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f36616q = 0;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.touch.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TouchEventData.java */
    public static class C0430a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f36618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f36619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f36620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f36621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f36622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f36623g;

        public C0430a(int i10, float f10, float f11, float f12, float f13, float f14, int i11) {
            this.f36617a = i10;
            this.f36618b = f10;
            this.f36619c = f11;
            this.f36620d = f12;
            this.f36621e = f13;
            this.f36622f = f14;
            this.f36623g = i11;
        }
    }

    private float a(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawX(motionEvent.getActionIndex()) : motionEvent.getRawX();
    }

    private String a(View view) {
        CharSequence contentDescription = view.getContentDescription();
        return contentDescription != null ? contentDescription.toString() : "";
    }

    private void a(HashMap<String, Object> map) {
        map.put("event_name", "touch");
        map.put("event_time", String.valueOf(System.currentTimeMillis()));
        map.put("down_time", String.valueOf(this.f36606g));
    }

    private float b(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 29 ? motionEvent.getRawY(motionEvent.getActionIndex()) : motionEvent.getRawY();
    }

    private String b(View view) {
        if (view.getId() == -1) {
            return "";
        }
        try {
            return view.getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return String.valueOf(view.getId());
        }
    }

    private void b(HashMap<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        for (C0430a c0430a : this.f36615p) {
            HashMap map2 = new HashMap();
            map2.put(VastAttributes.HORIZONTAL_POSITION, String.valueOf(c0430a.f36618b));
            map2.put(VastAttributes.VERTICAL_POSITION, String.valueOf(c0430a.f36619c));
            map2.put("pressure", String.valueOf(c0430a.f36620d));
            map2.put("size", String.valueOf(c0430a.f36621e));
            map2.put("id", Integer.valueOf(c0430a.f36617a));
            arrayList.add(map2);
        }
        map.put("points", arrayList);
    }

    private void c(HashMap<String, Object> map) {
        map.put("down_x", Float.valueOf(this.f36600a));
        map.put("down_y", Float.valueOf(this.f36601b));
        map.put("down_time", Long.valueOf(this.f36606g));
        map.put("up_x", Float.valueOf(this.f36604e));
        map.put("up_y", Float.valueOf(this.f36605f));
        map.put("up_time", Long.valueOf(this.f36607h));
    }

    private void d(HashMap<String, Object> map) {
        View view = this.f36614o;
        if (view != null) {
            map.put("class_name", view.getClass().getSimpleName());
            String strB = b(this.f36614o);
            map.put("resource_id", strB);
            String strA = a(this.f36614o);
            map.put("content_desc", strA);
            map.put("view_format", String.format("%s#%s(%s)", this.f36614o.getClass().getSimpleName(), strB, strA));
        }
    }

    private void g(MotionEvent motionEvent) {
        this.f36615p.clear();
        if (Build.VERSION.SDK_INT < 29) {
            this.f36616q = 1;
            this.f36615p.add(new C0430a(motionEvent.getPointerId(0), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getOrientation(), motionEvent.getToolType(motionEvent.getActionIndex())));
        } else {
            this.f36616q = motionEvent.getPointerCount();
            for (int i10 = 0; i10 < this.f36616q; i10++) {
                this.f36615p.add(new C0430a(motionEvent.getPointerId(i10), motionEvent.getRawX(i10), motionEvent.getRawY(i10), motionEvent.getPressure(i10), motionEvent.getSize(i10), motionEvent.getOrientation(i10), motionEvent.getToolType(i10)));
            }
        }
    }

    private void h(MotionEvent motionEvent) {
        this.f36608i = motionEvent.getPressure();
        this.f36609j = motionEvent.getSize();
        this.f36610k = motionEvent.getOrientation();
        this.f36611l = motionEvent.getToolType(motionEvent.getActionIndex());
    }

    public HashMap<String, Object> a() {
        HashMap<String, Object> map = new HashMap<>();
        a(map);
        b(map);
        d(map);
        c(map);
        return map;
    }

    public C0430a b() {
        if (this.f36615p.isEmpty()) {
            return null;
        }
        return this.f36615p.get(0);
    }

    public void c() {
        this.f36605f = 0.0f;
        this.f36604e = 0.0f;
        this.f36603d = 0.0f;
        this.f36602c = 0.0f;
        this.f36601b = 0.0f;
        this.f36600a = 0.0f;
        this.f36607h = 0L;
        this.f36606g = 0L;
        this.f36610k = 0.0f;
        this.f36609j = 0.0f;
        this.f36608i = 0.0f;
        this.f36611l = 0;
        this.f36613n = 0;
        this.f36612m = 0;
        this.f36614o = null;
        this.f36616q = 0;
        this.f36615p.clear();
    }

    public void c(MotionEvent motionEvent) {
        g(motionEvent);
    }

    public void c(View view) {
        this.f36614o = view;
        this.f36612m = view.getWidth();
        this.f36613n = view.getHeight();
    }

    public void d(MotionEvent motionEvent) {
        this.f36600a = a(motionEvent);
        this.f36601b = b(motionEvent);
        this.f36606g = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }

    public void e(MotionEvent motionEvent) {
        this.f36602c = a(motionEvent);
        this.f36603d = b(motionEvent);
        h(motionEvent);
        g(motionEvent);
    }

    public void f(MotionEvent motionEvent) {
        this.f36604e = a(motionEvent);
        this.f36605f = b(motionEvent);
        this.f36607h = System.currentTimeMillis();
        h(motionEvent);
        g(motionEvent);
    }
}
