package okio.internal;

import ao.i;
import ao.k;
import ao.l;
import bn.r;
import cn.m;
import hn.c;
import in.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import okio.FileMetadata;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class FileSystem {

    /* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    /* JADX INFO: compiled from: FileSystem.kt */
    @d(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileSystem.kt */
    @d(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
    public static final class C53541 extends RestrictedSuspendLambda implements p<k<? super Path>, c<? super r>, Object> {
        public final /* synthetic */ Path $dir;
        public final /* synthetic */ boolean $followSymlinks;
        public final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C53541(Path path, okio.FileSystem fileSystem, boolean z10, c<? super C53541> cVar) {
            super(2, cVar);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C53541 c53541 = new C53541(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, cVar);
            c53541.L$0 = obj;
            return c53541;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull k<? super Path> kVar, @Nullable c<? super r> cVar) {
            return ((C53541) create(kVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C53541 c53541;
            k kVar;
            m mVar;
            Iterator<Path> it;
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                k kVar2 = (k) this.L$0;
                m mVar2 = new m();
                mVar2.addLast(this.$dir);
                c53541 = this;
                kVar = kVar2;
                mVar = mVar2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                m mVar3 = (m) this.L$1;
                k kVar3 = (k) this.L$0;
                kotlin.c.b(obj);
                c53541 = this;
                mVar = mVar3;
                kVar = kVar3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                okio.FileSystem fileSystem = c53541.$this_commonListRecursively;
                boolean z10 = c53541.$followSymlinks;
                c53541.L$0 = kVar;
                c53541.L$1 = mVar;
                c53541.L$2 = it;
                c53541.label = 1;
                if (FileSystem.collectRecursively(kVar, fileSystem, mVar, next, z10, false, c53541) == objG) {
                    return objG;
                }
            }
            return r.f5635a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e1, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        if (r14 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
    
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
    
        r13 = r12;
        r12 = r11;
        r11 = r6;
        r6 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0130, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0131, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [ao.k] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [ao.k, ao.k<? super okio.Path>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v1, types: [ao.k] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collectRecursively(@org.jetbrains.annotations.NotNull ao.k<? super okio.Path> r17, @org.jetbrains.annotations.NotNull okio.FileSystem r18, @org.jetbrains.annotations.NotNull cn.m<okio.Path> r19, @org.jetbrains.annotations.NotNull okio.Path r20, boolean r21, boolean r22, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.collectRecursively(ao.k, okio.FileSystem, cn.m, okio.Path, boolean, boolean, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:3:0x0014, B:19:0x003d, B:25:0x0050, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:37:0x0014, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: all -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:3:0x0014, B:19:0x003d, B:25:0x0050, B:16:0x0036, B:13:0x0031, B:4:0x001c), top: B:37:0x0014, inners: #1, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void commonCopy(@org.jetbrains.annotations.NotNull okio.FileSystem r4, @org.jetbrains.annotations.NotNull okio.Path r5, @org.jetbrains.annotations.NotNull okio.Path r6) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            tn.p.k(r4, r0)
            java.lang.String r0 = "source"
            tn.p.k(r5, r0)
            java.lang.String r0 = "target"
            tn.p.k(r6, r0)
            okio.Source r5 = r4.source(r5)
            r0 = 0
            okio.Sink r4 = r4.sink(r6)     // Catch: java.lang.Throwable -> L51
            okio.BufferedSink r4 = okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> L51
            long r1 = r4.writeAll(r5)     // Catch: java.lang.Throwable -> L2e
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2c
            r4.close()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r4 = move-exception
            goto L3b
        L2c:
            r4 = r0
            goto L3b
        L2e:
            r6 = move-exception
            if (r4 == 0) goto L39
            r4.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r4 = move-exception
            bn.d.a(r6, r4)     // Catch: java.lang.Throwable -> L51
        L39:
            r4 = r6
            r6 = r0
        L3b:
            if (r4 != 0) goto L50
            tn.p.h(r6)     // Catch: java.lang.Throwable -> L51
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L51
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L51
            if (r5 == 0) goto L5f
            r5.close()     // Catch: java.lang.Throwable -> L4e
            goto L5f
        L4e:
            r0 = move-exception
            goto L5f
        L50:
            throw r4     // Catch: java.lang.Throwable -> L51
        L51:
            r4 = move-exception
            if (r5 == 0) goto L5c
            r5.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r5 = move-exception
            bn.d.a(r4, r5)
        L5c:
            r3 = r0
            r0 = r4
            r4 = r3
        L5f:
            if (r0 != 0) goto L65
            tn.p.h(r4)
            return
        L65:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.commonCopy(okio.FileSystem, okio.Path, okio.Path):void");
    }

    public static final void commonCreateDirectories(@NotNull okio.FileSystem fileSystem, @NotNull Path path, boolean z10) throws IOException {
        tn.p.k(fileSystem, "<this>");
        tn.p.k(path, "dir");
        m mVar = new m();
        for (Path pathParent = path; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            mVar.addFirst(pathParent);
        }
        if (z10 && mVar.isEmpty()) {
            throw new IOException(path + " already exists.");
        }
        Iterator<E> it = mVar.iterator();
        while (it.hasNext()) {
            fileSystem.createDirectory((Path) it.next());
        }
    }

    public static final void commonDeleteRecursively(@NotNull okio.FileSystem fileSystem, @NotNull Path path, boolean z10) throws IOException {
        tn.p.k(fileSystem, "<this>");
        tn.p.k(path, "fileOrDirectory");
        Iterator it = l.b(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, path, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean commonExists(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        tn.p.k(fileSystem, "<this>");
        tn.p.k(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    @NotNull
    public static final i<Path> commonListRecursively(@NotNull okio.FileSystem fileSystem, @NotNull Path path, boolean z10) throws IOException {
        tn.p.k(fileSystem, "<this>");
        tn.p.k(path, "dir");
        return l.b(new C53541(path, fileSystem, z10, null));
    }

    @NotNull
    public static final FileMetadata commonMetadata(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        tn.p.k(fileSystem, "<this>");
        tn.p.k(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @Nullable
    public static final Path symlinkTarget(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        tn.p.k(fileSystem, "<this>");
        tn.p.k(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        tn.p.h(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
