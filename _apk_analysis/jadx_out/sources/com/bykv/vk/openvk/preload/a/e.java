package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: InterceptorFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public interface e {

    /* JADX INFO: compiled from: InterceptorFactory.java */
    public static class a implements e {
        @Override // com.bykv.vk.openvk.preload.a.e
        public final <T> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    <T> T a(Class<T> cls);
}
