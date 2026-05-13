package com.inmobi.media;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Bb {
    public static final Ab a(String str) {
        tn.p.k(str, "logLevel");
        return bo.a0.J(str, "DEBUG", true) ? Ab.f25152b : bo.a0.J(str, "ERROR", true) ? Ab.f25153c : bo.a0.J(str, "INFO", true) ? Ab.f25151a : bo.a0.J(str, "STATE", true) ? Ab.f25154d : Ab.f25153c;
    }
}
