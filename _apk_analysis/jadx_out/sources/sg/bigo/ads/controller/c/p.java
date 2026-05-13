package sg.bigo.ads.controller.c;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f83192a = new ArrayList();

    public static abstract class a {
        private a() {
        }

        public /* synthetic */ a(byte b10) {
            this();
        }

        public abstract int a();

        public abstract void a(ByteBuffer byteBuffer);
    }

    public final void a(final int i10) {
        this.f83192a.add(new a() { // from class: sg.bigo.ads.controller.c.p.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((byte) 0);
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final int a() {
                return 4;
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final void a(ByteBuffer byteBuffer) {
                byteBuffer.putInt(i10);
            }
        });
    }

    public final void a(String str) {
        this.f83192a.add(new a(str) { // from class: sg.bigo.ads.controller.c.p.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final byte[] f83193a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f83194b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                byte[] bytes;
                super((byte) 0);
                this.f83194b = str;
                try {
                    bytes = str.getBytes("UTF-8");
                } catch (Exception unused) {
                    bytes = new byte[0];
                }
                this.f83193a = bytes;
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final int a() {
                return this.f83193a.length + 4;
            }

            @Override // sg.bigo.ads.controller.c.p.a
            public final void a(ByteBuffer byteBuffer) {
                byteBuffer.putInt(this.f83193a.length);
                byteBuffer.put(this.f83193a);
            }
        });
    }
}
