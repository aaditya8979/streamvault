package com.applovin.shadow.okio.internal;

import ao.i;
import ao.k;
import ao.l;
import bn.r;
import cn.m;
import com.applovin.shadow.okio.FileMetadata;
import com.applovin.shadow.okio.Path;
import hn.c;
import in.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class FileSystem {

    /* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
    /* JADX INFO: compiled from: FileSystem.kt */
    @d(c = "com.applovin.shadow.okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively")
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

    /* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FileSystem.kt */
    @d(c = "com.applovin.shadow.okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
    public static final class C14131 extends RestrictedSuspendLambda implements p<k<? super Path>, c<? super r>, Object> {
        public final /* synthetic */ Path $dir;
        public final /* synthetic */ boolean $followSymlinks;
        public final /* synthetic */ com.applovin.shadow.okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14131(Path path, com.applovin.shadow.okio.FileSystem fileSystem, boolean z10, c<? super C14131> cVar) {
            super(2, cVar);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            C14131 c14131 = new C14131(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, cVar);
            c14131.L$0 = obj;
            return c14131;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull k<? super Path> kVar, @Nullable c<? super r> cVar) {
            return ((C14131) create(kVar, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            C14131 c14131;
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
                c14131 = this;
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
                c14131 = this;
                mVar = mVar3;
                kVar = kVar3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                com.applovin.shadow.okio.FileSystem fileSystem = c14131.$this_commonListRecursively;
                boolean z10 = c14131.$followSymlinks;
                c14131.L$0 = kVar;
                c14131.L$1 = mVar;
                c14131.L$2 = it;
                c14131.label = 1;
                if (FileSystem.collectRecursively(kVar, fileSystem, mVar, next, z10, false, c14131) == objG) {
                    return objG;
                }
            }
            return r.f5635a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
    
        if (r0 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
    
        if (r14 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e6, code lost:
    
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
    
        r13 = r12;
        r12 = r11;
        r11 = r6;
        r6 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0131, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0132, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4, types: [ao.k] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v0, types: [ao.k, ao.k<? super com.applovin.shadow.okio.Path>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v1, types: [ao.k] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collectRecursively(@org.jetbrains.annotations.NotNull ao.k<? super com.applovin.shadow.okio.Path> r17, @org.jetbrains.annotations.NotNull com.applovin.shadow.okio.FileSystem r18, @org.jetbrains.annotations.NotNull cn.m<com.applovin.shadow.okio.Path> r19, @org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Path r20, boolean r21, boolean r22, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.collectRecursively(ao.k, com.applovin.shadow.okio.FileSystem, cn.m, com.applovin.shadow.okio.Path, boolean, boolean, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:3:0x0016, B:19:0x003f, B:25:0x0052, B:16:0x0038, B:4:0x001e, B:13:0x0033), top: B:41:0x0016, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:3:0x0016, B:19:0x003f, B:25:0x0052, B:16:0x0038, B:4:0x001e, B:13:0x0033), top: B:41:0x0016, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void commonCopy(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.FileSystem r4, @org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Path r5, @org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Path r6) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            tn.p.k(r4, r0)
            java.lang.String r0 = "source"
            tn.p.k(r5, r0)
            java.lang.String r0 = "target"
            tn.p.k(r6, r0)
            com.applovin.shadow.okio.Source r5 = r4.source(r5)
            r0 = 0
            com.applovin.shadow.okio.Sink r4 = r4.sink(r6)     // Catch: java.lang.Throwable -> L53
            com.applovin.shadow.okio.BufferedSink r4 = com.applovin.shadow.okio.Okio.buffer(r4)     // Catch: java.lang.Throwable -> L53
            long r1 = r4.writeAll(r5)     // Catch: java.lang.Throwable -> L30
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L2e
            r4.close()     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r4 = move-exception
            goto L3d
        L2e:
            r4 = r0
            goto L3d
        L30:
            r6 = move-exception
            if (r4 == 0) goto L3b
            r4.close()     // Catch: java.lang.Throwable -> L37
            goto L3b
        L37:
            r4 = move-exception
            bn.d.a(r6, r4)     // Catch: java.lang.Throwable -> L53
        L3b:
            r4 = r6
            r6 = r0
        L3d:
            if (r4 != 0) goto L52
            tn.p.h(r6)     // Catch: java.lang.Throwable -> L53
            long r1 = r6.longValue()     // Catch: java.lang.Throwable -> L53
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L61
            r5.close()     // Catch: java.lang.Throwable -> L50
            goto L61
        L50:
            r0 = move-exception
            goto L61
        L52:
            throw r4     // Catch: java.lang.Throwable -> L53
        L53:
            r4 = move-exception
            if (r5 == 0) goto L5e
            r5.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r5 = move-exception
            bn.d.a(r4, r5)
        L5e:
            r3 = r0
            r0 = r4
            r4 = r3
        L61:
            if (r0 != 0) goto L67
            tn.p.h(r4)
            return
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.FileSystem.commonCopy(com.applovin.shadow.okio.FileSystem, com.applovin.shadow.okio.Path, com.applovin.shadow.okio.Path):void");
    }

    public static final void commonCreateDirectories(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path path, boolean z10) throws IOException {
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

    public static final void commonDeleteRecursively(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path path, boolean z10) throws IOException {
        tn.p.k(fileSystem, "<this>");
        tn.p.k(path, "fileOrDirectory");
        Iterator it = l.b(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, path, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean commonExists(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        tn.p.k(fileSystem, "<this>");
        tn.p.k(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    @NotNull
    public static final i<Path> commonListRecursively(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path path, boolean z10) throws IOException {
        tn.p.k(fileSystem, "<this>");
        tn.p.k(path, "dir");
        return l.b(new C14131(path, fileSystem, z10, null));
    }

    @NotNull
    public static final FileMetadata commonMetadata(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        tn.p.k(fileSystem, "<this>");
        tn.p.k(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    @Nullable
    public static final Path symlinkTarget(@NotNull com.applovin.shadow.okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
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
