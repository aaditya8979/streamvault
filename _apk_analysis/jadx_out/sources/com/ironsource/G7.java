package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public interface G7 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList<C5> f29415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f29416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f29417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Exception f29418d;

        public a(ArrayList<C5> arrayList) {
            this.f29416b = false;
            this.f29417c = -1;
            this.f29415a = arrayList;
        }

        public a(ArrayList<C5> arrayList, int i10, boolean z10, Exception exc) {
            this.f29415a = arrayList;
            this.f29416b = z10;
            this.f29418d = exc;
            this.f29417c = i10;
        }

        public a a(int i10) {
            return new a(this.f29415a, i10, this.f29416b, this.f29418d);
        }

        public a a(Exception exc) {
            return new a(this.f29415a, this.f29417c, this.f29416b, exc);
        }

        public a a(boolean z10) {
            return new a(this.f29415a, this.f29417c, z10, this.f29418d);
        }

        public String a() {
            if (this.f29416b) {
                return "";
            }
            return "rc=" + this.f29417c + ", ex=" + this.f29418d;
        }

        public ArrayList<C5> b() {
            return this.f29415a;
        }

        public boolean c() {
            return this.f29416b;
        }

        public String toString() {
            return "EventSendResult{success=" + this.f29416b + ", responseCode=" + this.f29417c + ", exception=" + this.f29418d + '}';
        }
    }

    void a(a aVar);
}
