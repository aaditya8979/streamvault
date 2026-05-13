package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public interface bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f88040a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    zk a(zk zkVar);

    void a(ByteBuffer byteBuffer);

    void b();

    void flush();

    boolean isActive();

    boolean isEnded();

    void reset();
}
