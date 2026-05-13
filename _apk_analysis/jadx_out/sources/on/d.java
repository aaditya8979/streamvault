package on;

import bn.r;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.AccessDeniedException;
import kotlin.io.FileWalkDirection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements ao.i<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f76480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FileWalkDirection f76481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final l<File, Boolean> f76482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final l<File, r> f76483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final p<File, IOException, r> f76484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f76485f;

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull File file) {
            super(file);
            tn.p.k(file, "rootDir");
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public final class b extends cn.c<File> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayDeque<c> f76486b;

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f76488b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public File[] f76489c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f76490d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f76491e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f76492f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b bVar, File file) {
                super(file);
                tn.p.k(file, "rootDir");
                this.f76492f = bVar;
            }

            @Override // on.d.c
            @Nullable
            public File b() {
                if (!this.f76491e && this.f76489c == null) {
                    l lVar = d.this.f76482c;
                    boolean z10 = false;
                    if (lVar != null && !((Boolean) lVar.invoke(a())).booleanValue()) {
                        z10 = true;
                    }
                    if (z10) {
                        return null;
                    }
                    File[] fileArrListFiles = a().listFiles();
                    this.f76489c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        p pVar = d.this.f76484e;
                        if (pVar != null) {
                            pVar.mo2invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f76491e = true;
                    }
                }
                File[] fileArr = this.f76489c;
                if (fileArr != null) {
                    int i10 = this.f76490d;
                    tn.p.h(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f76489c;
                        tn.p.h(fileArr2);
                        int i11 = this.f76490d;
                        this.f76490d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f76488b) {
                    this.f76488b = true;
                    return a();
                }
                l lVar2 = d.this.f76483d;
                if (lVar2 != null) {
                    lVar2.invoke(a());
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: on.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class C0907b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f76493b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f76494c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0907b(@NotNull b bVar, File file) {
                super(file);
                tn.p.k(file, "rootFile");
                this.f76494c = bVar;
            }

            @Override // on.d.c
            @Nullable
            public File b() {
                if (this.f76493b) {
                    return null;
                }
                this.f76493b = true;
                return a();
            }
        }

        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public final class c extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f76495b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public File[] f76496c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f76497d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f76498e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull b bVar, File file) {
                super(file);
                tn.p.k(file, "rootDir");
                this.f76498e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // on.d.c
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f76495b
                    r1 = 0
                    if (r0 != 0) goto L2c
                    on.d$b r0 = r10.f76498e
                    on.d r0 = on.d.this
                    sn.l r0 = on.d.e(r0)
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L22
                    java.io.File r4 = r10.a()
                    java.lang.Object r0 = r0.invoke(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L22
                    r2 = r3
                L22:
                    if (r2 == 0) goto L25
                    return r1
                L25:
                    r10.f76495b = r3
                    java.io.File r0 = r10.a()
                    return r0
                L2c:
                    java.io.File[] r0 = r10.f76496c
                    if (r0 == 0) goto L4b
                    int r2 = r10.f76497d
                    tn.p.h(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L39
                    goto L4b
                L39:
                    on.d$b r0 = r10.f76498e
                    on.d r0 = on.d.this
                    sn.l r0 = on.d.g(r0)
                    if (r0 == 0) goto L4a
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L4a:
                    return r1
                L4b:
                    java.io.File[] r0 = r10.f76496c
                    if (r0 != 0) goto L97
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f76496c = r0
                    if (r0 != 0) goto L7b
                    on.d$b r0 = r10.f76498e
                    on.d r0 = on.d.this
                    sn.p r0 = on.d.f(r0)
                    if (r0 == 0) goto L7b
                    java.io.File r2 = r10.a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.mo2invoke(r2, r9)
                L7b:
                    java.io.File[] r0 = r10.f76496c
                    if (r0 == 0) goto L85
                    tn.p.h(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L97
                L85:
                    on.d$b r0 = r10.f76498e
                    on.d r0 = on.d.this
                    sn.l r0 = on.d.g(r0)
                    if (r0 == 0) goto L96
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L96:
                    return r1
                L97:
                    java.io.File[] r0 = r10.f76496c
                    tn.p.h(r0)
                    int r1 = r10.f76497d
                    int r2 = r1 + 1
                    r10.f76497d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: on.d.b.c.b():java.io.File");
            }
        }

        /* JADX INFO: renamed from: on.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FileTreeWalk.kt */
        public /* synthetic */ class C0908d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f76486b = arrayDeque;
            if (d.this.f76480a.isDirectory()) {
                arrayDeque.push(a(d.this.f76480a));
            } else if (d.this.f76480a.isFile()) {
                arrayDeque.push(new C0907b(this, d.this.f76480a));
            } else {
                done();
            }
        }

        public final a a(File file) {
            int i10 = C0908d.$EnumSwitchMapping$0[d.this.f76481b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final File b() {
            File fileB;
            while (true) {
                c cVarPeek = this.f76486b.peek();
                if (cVarPeek == null) {
                    return null;
                }
                fileB = cVarPeek.b();
                if (fileB == null) {
                    this.f76486b.pop();
                } else {
                    if (tn.p.f(fileB, cVarPeek.a()) || !fileB.isDirectory() || this.f76486b.size() >= d.this.f76485f) {
                        break;
                    }
                    this.f76486b.push(a(fileB));
                }
            }
            return fileB;
        }

        @Override // cn.c
        public void computeNext() {
            File fileB = b();
            if (fileB != null) {
                setNext(fileB);
            } else {
                done();
            }
        }
    }

    /* JADX INFO: compiled from: FileTreeWalk.kt */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final File f76499a;

        public c(@NotNull File file) {
            tn.p.k(file, "root");
            this.f76499a = file;
        }

        @NotNull
        public final File a() {
            return this.f76499a;
        }

        @Nullable
        public abstract File b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@NotNull File file, @NotNull FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
        tn.p.k(file, "start");
        tn.p.k(fileWalkDirection, "direction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(File file, FileWalkDirection fileWalkDirection, l<? super File, Boolean> lVar, l<? super File, r> lVar2, p<? super File, ? super IOException, r> pVar, int i10) {
        this.f76480a = file;
        this.f76481b = fileWalkDirection;
        this.f76482c = lVar;
        this.f76483d = lVar2;
        this.f76484e = pVar;
        this.f76485f = i10;
    }

    public /* synthetic */ d(File file, FileWalkDirection fileWalkDirection, l lVar, l lVar2, p pVar, int i10, int i11, tn.i iVar) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, lVar, lVar2, pVar, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    @Override // ao.i
    @NotNull
    public Iterator<File> iterator() {
        return new b();
    }
}
