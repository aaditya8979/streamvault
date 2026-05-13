package org.eclipse.jetty.io.nio;

import ar.e;
import hq.i;
import hq.j;
import hq.k;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import sq.p;
import uq.e;

/* JADX INFO: compiled from: SelectorManager.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends uq.a implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final vq.c f76702s = vq.b.b("org.eclipse.jetty.io.nio");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f76703t = Integer.getInteger("org.eclipse.jetty.io.nio.MONITOR_PERIOD", 1000).intValue();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f76704u = Integer.getInteger("org.eclipse.jetty.io.nio.MAX_SELECTS", 100000).intValue();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f76705v = Integer.getInteger("org.eclipse.jetty.io.nio.BUSY_PAUSE", 50).intValue();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f76706w = Integer.getInteger("org.eclipse.jetty.io.nio.IDLE_TICK", 400).intValue();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f76707k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f76708l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f76709m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d[] f76710n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f76711o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile int f76712p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f76713q = true;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f76714r = 0;

    /* JADX INFO: compiled from: SelectorManager.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f76715b;

        public a(int i10) {
            this.f76715b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            String name = Thread.currentThread().getName();
            int priority = Thread.currentThread().getPriority();
            try {
                d[] dVarArr = b.this.f76710n;
                if (dVarArr == null) {
                    b.f76702s.h("Stopped {} on {}", Thread.currentThread(), this);
                    Thread.currentThread().setName(name);
                    if (b.this.z0() != 0) {
                        Thread.currentThread().setPriority(priority);
                        return;
                    }
                    return;
                }
                d dVar = dVarArr[this.f76715b];
                Thread.currentThread().setName(name + " Selector" + this.f76715b);
                if (b.this.z0() != 0) {
                    Thread.currentThread().setPriority(Thread.currentThread().getPriority() + b.this.z0());
                }
                b.f76702s.h("Starting {} on {}", Thread.currentThread(), this);
                while (b.this.isRunning()) {
                    try {
                        dVar.h();
                    } catch (IOException e10) {
                        b.f76702s.g(e10);
                    } catch (Exception e11) {
                        b.f76702s.e(e11);
                    }
                }
                b.f76702s.h("Stopped {} on {}", Thread.currentThread(), this);
                Thread.currentThread().setName(name);
                if (b.this.z0() != 0) {
                    Thread.currentThread().setPriority(priority);
                }
            } catch (Throwable th2) {
                b.f76702s.h("Stopped {} on {}", Thread.currentThread(), this);
                Thread.currentThread().setName(name);
                if (b.this.z0() != 0) {
                    Thread.currentThread().setPriority(priority);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: org.eclipse.jetty.io.nio.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SelectorManager.java */
    public interface InterfaceRunnableC0917b extends Runnable {
    }

    /* JADX INFO: compiled from: SelectorManager.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SelectableChannel f76717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f76718b;

        public c(SelectableChannel selectableChannel, Object obj) {
            this.f76717a = selectableChannel;
            this.f76718b = obj;
        }
    }

    /* JADX INFO: compiled from: SelectorManager.java */
    public class d implements e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f76719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ar.e f76720c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile Selector f76722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile Thread f76723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f76724g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f76725h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f76726i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f76727j;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ConcurrentLinkedQueue<Object> f76721d = new ConcurrentLinkedQueue<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ConcurrentMap<SelectChannelEndPoint, Object> f76729l = new ConcurrentHashMap();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile long f76728k = System.currentTimeMillis();

        /* JADX INFO: compiled from: SelectorManager.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f76731b;

            public a(long j10) {
                this.f76731b = j10;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator it = d.this.f76729l.keySet().iterator();
                while (it.hasNext()) {
                    ((SelectChannelEndPoint) it.next()).B(this.f76731b);
                }
            }

            public String toString() {
                return "Idle-" + super.toString();
            }
        }

        /* JADX INFO: renamed from: org.eclipse.jetty.io.nio.b$d$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SelectorManager.java */
        public class C0918b implements InterfaceRunnableC0917b {
            public C0918b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.m();
            }
        }

        /* JADX INFO: compiled from: SelectorManager.java */
        public class c implements InterfaceRunnableC0917b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ArrayList f76734b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CountDownLatch f76735c;

            public c(ArrayList arrayList, CountDownLatch countDownLatch) {
                this.f76734b = arrayList;
                this.f76735c = countDownLatch;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.i(this.f76734b);
                this.f76735c.countDown();
            }
        }

        public d(int i10) throws Exception {
            this.f76719b = i10;
            ar.e eVar = new ar.e(this);
            this.f76720c = eVar;
            eVar.i(0L);
            this.f76722e = Selector.open();
            this.f76725h = System.currentTimeMillis() + ((long) b.f76703t);
        }

        public void c(Object obj) {
            this.f76721d.add(obj);
        }

        public void d(SelectableChannel selectableChannel, Object obj) {
            if (obj == null) {
                c(selectableChannel);
            } else if (obj instanceof k) {
                c(obj);
            } else {
                c(new c(selectableChannel, obj));
            }
        }

        public void e(e.a aVar) {
            aVar.c();
        }

        public final SelectChannelEndPoint f(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
            SelectChannelEndPoint selectChannelEndPointC0 = b.this.C0(socketChannel, this, selectionKey);
            b.f76702s.h("created {}", selectChannelEndPointC0);
            b.this.w0(selectChannelEndPointC0);
            this.f76729l.put(selectChannelEndPointC0, this);
            return selectChannelEndPointC0;
        }

        public void g(SelectChannelEndPoint selectChannelEndPoint) {
            b.f76702s.h("destroyEndPoint {}", selectChannelEndPoint);
            this.f76729l.remove(selectChannelEndPoint);
            b.this.v0(selectChannelEndPoint);
        }

        /* JADX WARN: Code restructure failed: missing block: B:62:0x00d2, code lost:
        
            r2 = r1.selectNow();
            r5 = java.lang.System.currentTimeMillis();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00dd, code lost:
        
            if (r2 != 0) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00e7, code lost:
        
            if (r1.selectedKeys().isEmpty() == false) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00eb, code lost:
        
            if (r14.f76726i == false) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00ed, code lost:
        
            java.lang.Thread.sleep(org.eclipse.jetty.io.nio.b.f76705v);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00f6, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x00f7, code lost:
        
            org.eclipse.jetty.io.nio.b.f76702s.g(r2);
         */
        /* JADX WARN: Removed duplicated region for block: B:104:0x017d A[Catch: all -> 0x02d3, CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, TRY_LEAVE, TryCatch #16 {CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, blocks: (B:3:0x0001, B:7:0x000e, B:8:0x0014, B:10:0x0019, B:50:0x00a9, B:52:0x00b1, B:55:0x00be, B:58:0x00c3, B:53:0x00b7, B:60:0x00ca, B:62:0x00d2, B:64:0x00df, B:66:0x00e9, B:68:0x00ed, B:72:0x00fc, B:73:0x0100, B:75:0x0113, B:87:0x012c, B:89:0x013e, B:91:0x0145, B:93:0x0150, B:95:0x0156, B:71:0x00f7, B:96:0x0163, B:98:0x0167, B:101:0x016f, B:102:0x0177, B:104:0x017d, B:142:0x0209, B:144:0x0211, B:147:0x021e, B:152:0x022a, B:154:0x0232, B:156:0x0238, B:150:0x0223, B:145:0x0217, B:158:0x023e, B:159:0x0245, B:161:0x025d, B:163:0x0261, B:164:0x0268, B:165:0x026f, B:167:0x027c, B:169:0x0288, B:171:0x029b, B:173:0x02ad, B:174:0x02b7, B:176:0x02bd, B:178:0x02c3), top: B:207:0x0001, outer: #7 }] */
        /* JADX WARN: Removed duplicated region for block: B:161:0x025d A[Catch: all -> 0x02d3, CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, TryCatch #16 {CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, blocks: (B:3:0x0001, B:7:0x000e, B:8:0x0014, B:10:0x0019, B:50:0x00a9, B:52:0x00b1, B:55:0x00be, B:58:0x00c3, B:53:0x00b7, B:60:0x00ca, B:62:0x00d2, B:64:0x00df, B:66:0x00e9, B:68:0x00ed, B:72:0x00fc, B:73:0x0100, B:75:0x0113, B:87:0x012c, B:89:0x013e, B:91:0x0145, B:93:0x0150, B:95:0x0156, B:71:0x00f7, B:96:0x0163, B:98:0x0167, B:101:0x016f, B:102:0x0177, B:104:0x017d, B:142:0x0209, B:144:0x0211, B:147:0x021e, B:152:0x022a, B:154:0x0232, B:156:0x0238, B:150:0x0223, B:145:0x0217, B:158:0x023e, B:159:0x0245, B:161:0x025d, B:163:0x0261, B:164:0x0268, B:165:0x026f, B:167:0x027c, B:169:0x0288, B:171:0x029b, B:173:0x02ad, B:174:0x02b7, B:176:0x02bd, B:178:0x02c3), top: B:207:0x0001, outer: #7 }] */
        /* JADX WARN: Removed duplicated region for block: B:167:0x027c A[Catch: all -> 0x02d3, CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, TryCatch #16 {CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, blocks: (B:3:0x0001, B:7:0x000e, B:8:0x0014, B:10:0x0019, B:50:0x00a9, B:52:0x00b1, B:55:0x00be, B:58:0x00c3, B:53:0x00b7, B:60:0x00ca, B:62:0x00d2, B:64:0x00df, B:66:0x00e9, B:68:0x00ed, B:72:0x00fc, B:73:0x0100, B:75:0x0113, B:87:0x012c, B:89:0x013e, B:91:0x0145, B:93:0x0150, B:95:0x0156, B:71:0x00f7, B:96:0x0163, B:98:0x0167, B:101:0x016f, B:102:0x0177, B:104:0x017d, B:142:0x0209, B:144:0x0211, B:147:0x021e, B:152:0x022a, B:154:0x0232, B:156:0x0238, B:150:0x0223, B:145:0x0217, B:158:0x023e, B:159:0x0245, B:161:0x025d, B:163:0x0261, B:164:0x0268, B:165:0x026f, B:167:0x027c, B:169:0x0288, B:171:0x029b, B:173:0x02ad, B:174:0x02b7, B:176:0x02bd, B:178:0x02c3), top: B:207:0x0001, outer: #7 }] */
        /* JADX WARN: Removed duplicated region for block: B:215:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:228:0x00cf A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: all -> 0x02d3, CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, TryCatch #16 {CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, blocks: (B:3:0x0001, B:7:0x000e, B:8:0x0014, B:10:0x0019, B:50:0x00a9, B:52:0x00b1, B:55:0x00be, B:58:0x00c3, B:53:0x00b7, B:60:0x00ca, B:62:0x00d2, B:64:0x00df, B:66:0x00e9, B:68:0x00ed, B:72:0x00fc, B:73:0x0100, B:75:0x0113, B:87:0x012c, B:89:0x013e, B:91:0x0145, B:93:0x0150, B:95:0x0156, B:71:0x00f7, B:96:0x0163, B:98:0x0167, B:101:0x016f, B:102:0x0177, B:104:0x017d, B:142:0x0209, B:144:0x0211, B:147:0x021e, B:152:0x022a, B:154:0x0232, B:156:0x0238, B:150:0x0223, B:145:0x0217, B:158:0x023e, B:159:0x0245, B:161:0x025d, B:163:0x0261, B:164:0x0268, B:165:0x026f, B:167:0x027c, B:169:0x0288, B:171:0x029b, B:173:0x02ad, B:174:0x02b7, B:176:0x02bd, B:178:0x02c3), top: B:207:0x0001, outer: #7 }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00b7 A[Catch: all -> 0x02d3, CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, TRY_LEAVE, TryCatch #16 {CancelledKeyException -> 0x02d5, ClosedSelectorException -> 0x02de, blocks: (B:3:0x0001, B:7:0x000e, B:8:0x0014, B:10:0x0019, B:50:0x00a9, B:52:0x00b1, B:55:0x00be, B:58:0x00c3, B:53:0x00b7, B:60:0x00ca, B:62:0x00d2, B:64:0x00df, B:66:0x00e9, B:68:0x00ed, B:72:0x00fc, B:73:0x0100, B:75:0x0113, B:87:0x012c, B:89:0x013e, B:91:0x0145, B:93:0x0150, B:95:0x0156, B:71:0x00f7, B:96:0x0163, B:98:0x0167, B:101:0x016f, B:102:0x0177, B:104:0x017d, B:142:0x0209, B:144:0x0211, B:147:0x021e, B:152:0x022a, B:154:0x0232, B:156:0x0238, B:150:0x0223, B:145:0x0217, B:158:0x023e, B:159:0x0245, B:161:0x025d, B:163:0x0261, B:164:0x0268, B:165:0x026f, B:167:0x027c, B:169:0x0288, B:171:0x029b, B:173:0x02ad, B:174:0x02b7, B:176:0x02bd, B:178:0x02c3), top: B:207:0x0001, outer: #7 }] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void h() throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 759
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.io.nio.b.d.h():void");
        }

        public void i(List<Object> list) {
            Selector selector = this.f76722e;
            Set<SelectionKey> setKeys = selector.keys();
            list.add(selector + " keys=" + setKeys.size());
            for (SelectionKey selectionKey : setKeys) {
                if (selectionKey.isValid()) {
                    list.add(selectionKey.attachment() + " iOps=" + selectionKey.interestOps() + " rOps=" + selectionKey.readyOps());
                } else {
                    list.add(selectionKey.attachment() + " iOps=-1 rOps=-1");
                }
            }
        }

        public b j() {
            return b.this;
        }

        public long k() {
            return this.f76720c.e();
        }

        public Selector l() {
            return this.f76722e;
        }

        public final void m() {
            try {
                synchronized (this) {
                    Selector selector = this.f76722e;
                    if (selector == null) {
                        return;
                    }
                    Selector selectorOpen = Selector.open();
                    for (SelectionKey selectionKey : selector.keys()) {
                        if (selectionKey.isValid() && selectionKey.interestOps() != 0) {
                            SelectableChannel selectableChannelChannel = selectionKey.channel();
                            Object objAttachment = selectionKey.attachment();
                            if (objAttachment == null) {
                                c(selectableChannelChannel);
                            } else {
                                d(selectableChannelChannel, objAttachment);
                            }
                        }
                    }
                    this.f76722e.close();
                    this.f76722e = selectorOpen;
                }
            } catch (IOException e10) {
                throw new RuntimeException("recreating selector", e10);
            }
        }

        public void n(e.a aVar, long j10) {
            if (!(aVar instanceof Runnable)) {
                throw new IllegalArgumentException("!Runnable");
            }
            this.f76720c.h(aVar, j10);
        }

        public void o() throws Exception {
            Selector selector;
            for (int i10 = 0; i10 < 100; i10++) {
                try {
                    if (this.f76723f == null) {
                        break;
                    }
                    p();
                    Thread.sleep(10L);
                } catch (Exception e10) {
                    b.f76702s.g(e10);
                }
            }
            synchronized (this) {
                for (SelectionKey selectionKey : this.f76722e.keys()) {
                    if (selectionKey != null) {
                        Object objAttachment = selectionKey.attachment();
                        if (objAttachment instanceof k) {
                            try {
                                ((k) objAttachment).close();
                            } catch (IOException e11) {
                                b.f76702s.g(e11);
                            }
                        }
                    }
                }
                this.f76720c.b();
                try {
                    selector = this.f76722e;
                } catch (IOException e12) {
                    b.f76702s.g(e12);
                }
                if (selector != null) {
                    selector.close();
                    this.f76722e = null;
                } else {
                    this.f76722e = null;
                }
            }
        }

        public void p() {
            try {
                Selector selector = this.f76722e;
                if (selector != null) {
                    selector.wakeup();
                }
            } catch (Exception unused) {
                c(new C0918b());
                m();
            }
        }

        public String toString() {
            Selector selector = this.f76722e;
            Object[] objArr = new Object[3];
            objArr[0] = super.toString();
            int size = -1;
            objArr[1] = Integer.valueOf((selector == null || !selector.isOpen()) ? -1 : selector.keys().size());
            if (selector != null && selector.isOpen()) {
                size = selector.selectedKeys().size();
            }
            objArr[2] = Integer.valueOf(size);
            return String.format("%s keys=%d selected=%d", objArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.StackTraceElement] */
        @Override // uq.e
        public void w(Appendable appendable, String str) throws IOException {
            ?? r42;
            appendable.append(String.valueOf(this)).append(" id=").append(String.valueOf(this.f76719b)).append("\n");
            Thread thread = this.f76723f;
            ?? stackTrace = thread == null ? 0 : thread.getStackTrace();
            if (stackTrace != 0) {
                int length = stackTrace.length;
                for (int i10 = 0; i10 < length; i10++) {
                    r42 = stackTrace[i10];
                    if (r42.getClassName().startsWith("org.eclipse.jetty.")) {
                        break;
                    }
                }
                r42 = "not selecting";
            } else {
                r42 = "not selecting";
            }
            Selector selector = this.f76722e;
            if (selector != null) {
                ArrayList arrayList = new ArrayList(selector.keys().size() * 2);
                arrayList.add(r42);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                c(new c(arrayList, countDownLatch));
                try {
                    countDownLatch.await(5L, TimeUnit.SECONDS);
                } catch (InterruptedException e10) {
                    b.f76702s.g(e10);
                }
                uq.b.p0(appendable, str, arrayList);
            }
        }
    }

    public boolean A0() {
        return this.f76713q;
    }

    public abstract jq.a B0(SocketChannel socketChannel, hq.c cVar, Object obj);

    public abstract SelectChannelEndPoint C0(SocketChannel socketChannel, d dVar, SelectionKey selectionKey) throws IOException;

    public void D0(SocketChannel socketChannel, Object obj) {
        int i10 = this.f76712p;
        this.f76712p = i10 + 1;
        if (i10 < 0) {
            i10 = -i10;
        }
        int i11 = i10 % this.f76711o;
        d[] dVarArr = this.f76710n;
        if (dVarArr != null) {
            d dVar = dVarArr[i11];
            dVar.d(socketChannel, obj);
            dVar.p();
        }
    }

    public abstract boolean Z(Runnable runnable);

    @Override // uq.a
    public void d0() throws Exception {
        this.f76710n = new d[this.f76711o];
        int i10 = 0;
        while (true) {
            d[] dVarArr = this.f76710n;
            if (i10 >= dVarArr.length) {
                break;
            }
            dVarArr[i10] = new d(i10);
            i10++;
        }
        super.d0();
        for (int i11 = 0; i11 < y0(); i11++) {
            if (!Z(new a(i11))) {
                throw new IllegalStateException("!Selecting");
            }
        }
    }

    @Override // uq.a
    public void e0() throws Exception {
        d[] dVarArr = this.f76710n;
        this.f76710n = null;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    dVar.o();
                }
            }
        }
        super.e0();
    }

    public void u0(SocketChannel socketChannel, Throwable th2, Object obj) {
        vq.c cVar = f76702s;
        cVar.f(th2 + StringUtils.COMMA + socketChannel + StringUtils.COMMA + obj, new Object[0]);
        cVar.b(th2);
    }

    public abstract void v0(SelectChannelEndPoint selectChannelEndPoint);

    @Override // uq.e
    public void w(Appendable appendable, String str) throws IOException {
        uq.b.q0(appendable, this);
        uq.b.p0(appendable, str, p.a(this.f76710n));
    }

    public abstract void w0(SelectChannelEndPoint selectChannelEndPoint);

    public abstract void x0(i iVar, j jVar);

    public int y0() {
        return this.f76711o;
    }

    public int z0() {
        return this.f76714r;
    }
}
