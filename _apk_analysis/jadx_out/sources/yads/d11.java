package yads;

import java.net.InetAddress;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;

/* JADX INFO: loaded from: classes3.dex */
public final class d11 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f88688b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f88689a = f88688b;

    public final boolean a(int i10, String str) {
        Object objM7534constructorimpl;
        ConcurrentHashMap concurrentHashMap = this.f88689a;
        Object objValueOf = concurrentHashMap.get(str);
        if (objValueOf == null) {
            try {
                Result.a aVar = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(Boolean.valueOf(InetAddress.getByName(str).isReachable(i10)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                objM7534constructorimpl = null;
            }
            Boolean bool = (Boolean) objM7534constructorimpl;
            objValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, objValueOf);
            if (objPutIfAbsent != null) {
                objValueOf = objPutIfAbsent;
            }
        }
        return ((Boolean) objValueOf).booleanValue();
    }
}
