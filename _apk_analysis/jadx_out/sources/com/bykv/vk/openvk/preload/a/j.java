package com.bykv.vk.openvk.preload.a;

import com.bykv.vk.openvk.preload.a.i;
import com.bykv.vk.openvk.preload.a.l;
import java.util.List;

/* JADX INFO: compiled from: RetryBranchInterceptor.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f11349d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in2) throws Throwable {
        new m(bVar);
        this.f11349d = a(in2);
        l.a aVar = a().get(this.f11349d);
        while (aVar != null) {
            List<h> list = aVar.f11352a;
            try {
                Object objA = c.a(list, bVar.f11345a, this).a(in2);
                return !l.a(list) ? objA : bVar.a(objA);
            } catch (i.a e10) {
                Throwable cause = e10.getCause();
                new m(bVar);
                this.f11349d = a(in2, cause, this.f11349d);
                aVar = a().get(this.f11349d);
            } catch (Throwable th2) {
                new m(bVar);
                this.f11349d = a(in2, th2, this.f11349d);
                aVar = a().get(this.f11349d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f11349d);
    }

    public abstract String a(IN in2);

    public abstract String a(IN in2, Throwable th2, String str);
}
