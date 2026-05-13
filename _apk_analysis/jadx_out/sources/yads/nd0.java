package yads;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class nd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md0 f92822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f92823b = new AtomicBoolean(false);

    public nd0(md0 md0Var) {
        this.f92822a = md0Var;
    }

    public final mq0 a(Object... objArr) {
        Constructor constructorA;
        synchronized (this.f92823b) {
            if (!this.f92823b.get()) {
                try {
                    constructorA = this.f92822a.a();
                } catch (ClassNotFoundException unused) {
                    this.f92823b.set(true);
                    constructorA = null;
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            constructorA = null;
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (mq0) constructorA.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }
}
