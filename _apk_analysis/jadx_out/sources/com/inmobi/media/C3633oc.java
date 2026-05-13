package com.inmobi.media;

import android.view.MotionEvent;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3633oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3337ci f27777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f27779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f27780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f27781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f27782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f27785i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JSONArray f27786j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MotionEvent f27787k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f27788l;

    public C3633oc(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "mListener");
        this.f27777a = gestureDetectorOnGestureListenerC3337ci;
        this.f27778b = C3633oc.class.getSimpleName();
        this.f27788l = Integer.MAX_VALUE;
        this.f27783g = -1;
        this.f27784h = -1;
    }

    public final void a(MotionEvent motionEvent) {
        float y10;
        float x10;
        float f10;
        tn.p.k(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            tn.p.j(this.f27778b, "TAG");
            motionEvent.toString();
            this.f27783g = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f27786j = new JSONArray();
            JSONArray jSONArray = new JSONArray((Collection) cn.w.p(Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY()))));
            JSONArray jSONArray2 = this.f27786j;
            if (jSONArray2 != null) {
                jSONArray2.put(jSONArray);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            tn.p.j(this.f27778b, "TAG");
            motionEvent.toString();
            this.f27783g = -1;
            JSONArray jSONArray3 = this.f27786j;
            if (jSONArray3 == null || jSONArray3.length() <= 5) {
                return;
            }
            this.f27777a.a(this);
            this.f27786j = new JSONArray();
            return;
        }
        float y11 = 0.0f;
        if (actionMasked == 2) {
            JSONArray jSONArray4 = this.f27786j;
            int i10 = this.f27783g;
            if (i10 == -1 || this.f27784h == -1) {
                if (i10 == -1 || jSONArray4 == null || jSONArray4.length() <= 0 || jSONArray4.length() >= 50) {
                    return;
                }
                try {
                    int iC = F3.c(motionEvent.getX());
                    int iC2 = F3.c(motionEvent.getY());
                    JSONArray jSONArray5 = jSONArray4.getJSONArray(jSONArray4.length() - 1);
                    JSONArray jSONArray6 = new JSONArray((Collection) cn.w.p(Integer.valueOf(iC), Integer.valueOf(iC2)));
                    float f11 = jSONArray5.getInt(0) - jSONArray6.getInt(0);
                    float f12 = jSONArray5.getInt(1) - jSONArray6.getInt(1);
                    if (((int) Math.sqrt((f12 * f12) + (f11 * f11))) > 100) {
                        jSONArray4.put(jSONArray6);
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i10);
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f27784h);
            if (iFindPointerIndex >= 0) {
                x10 = motionEvent.getX(iFindPointerIndex);
                y10 = motionEvent.getY(iFindPointerIndex);
            } else {
                bn.g gVar = P9.f26117a;
                P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.f27783g + " is " + iFindPointerIndex + " | Pointer count=" + motionEvent.getPointerCount())));
                y10 = 0.0f;
                x10 = 0.0f;
            }
            if (iFindPointerIndex2 >= 0) {
                float x11 = motionEvent.getX(iFindPointerIndex2);
                y11 = motionEvent.getY(iFindPointerIndex2);
                f10 = x11;
            } else {
                bn.g gVar2 = P9.f26117a;
                P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.f27784h + " is " + iFindPointerIndex2 + " | Pointer count=" + motionEvent.getPointerCount())));
                f10 = 0.0f;
            }
            float degrees = ((float) Math.toDegrees(((float) Math.atan2(this.f27780d - this.f27782f, this.f27779c - this.f27781e)) - ((float) Math.atan2(y11 - y10, f10 - x10)))) % 360;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            this.f27785i = Math.abs(degrees);
            return;
        }
        if (actionMasked == 3) {
            tn.p.j(this.f27778b, "TAG");
            motionEvent.toString();
            this.f27783g = -1;
            this.f27784h = -1;
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            tn.p.j(this.f27778b, "TAG");
            motionEvent.toString();
            this.f27784h = -1;
            if (this.f27785i > 30.0f) {
                MotionEvent motionEvent2 = this.f27787k;
                if (motionEvent2 != null) {
                    this.f27777a.b(this, motionEvent2, motionEvent);
                }
                this.f27785i = 0.0f;
            }
            float x12 = motionEvent.getX() - motionEvent.getX(1);
            float y12 = motionEvent.getY() - motionEvent.getY(1);
            if (Math.abs(((int) Math.sqrt((y12 * y12) + (x12 * x12))) - this.f27788l) > 500) {
                MotionEvent motionEvent3 = this.f27787k;
                if (motionEvent3 != null) {
                    this.f27777a.a(this, motionEvent3, motionEvent);
                }
                this.f27788l = Integer.MAX_VALUE;
                return;
            }
            return;
        }
        tn.p.j(this.f27778b, "TAG");
        motionEvent.toString();
        this.f27784h = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f27787k = MotionEvent.obtain(motionEvent);
        int iFindPointerIndex3 = motionEvent.findPointerIndex(this.f27783g);
        int iFindPointerIndex4 = motionEvent.findPointerIndex(this.f27784h);
        if (iFindPointerIndex3 >= 0) {
            this.f27781e = motionEvent.getX(iFindPointerIndex3);
            this.f27782f = motionEvent.getY(iFindPointerIndex3);
        } else {
            bn.g gVar3 = P9.f26117a;
            P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.f27783g + " is " + iFindPointerIndex3 + " | Pointer count=" + motionEvent.getPointerCount())));
        }
        if (iFindPointerIndex4 >= 0) {
            this.f27779c = motionEvent.getX(iFindPointerIndex4);
            this.f27780d = motionEvent.getY(iFindPointerIndex4);
        } else {
            bn.g gVar4 = P9.f26117a;
            P9.a(new L2(new IllegalArgumentException("Index for mPtrID2=" + this.f27784h + " is " + iFindPointerIndex4 + " | Pointer count=" + motionEvent.getPointerCount())));
        }
        float f13 = this.f27781e - this.f27779c;
        float f14 = this.f27782f - this.f27780d;
        this.f27788l = (int) Math.sqrt((f14 * f14) + (f13 * f13));
    }
}
