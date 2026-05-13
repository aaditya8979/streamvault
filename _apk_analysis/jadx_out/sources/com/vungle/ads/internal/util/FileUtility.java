package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import androidx.annotation.VisibleForTesting;
import cn.w;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3978d4;
import com.safedk.android.internal.partials.LiftoffMonetizeFilesBridge;
import com.vungle.ads.AssetFailedToDeleteError;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import on.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: FileUtility.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b:\u00109J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J&\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002J$\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J$\u0010\u0012\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010H\u0007J\"\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0007J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007J\u001f\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bJ\u0018\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\rJ\u0010\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0002J\u0010\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\rJ\u0010\u0010%\u001a\u00020$2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u001a\u0010'\u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\rR*\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u00101R*\u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000303028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b4\u00105\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/vungle/ads/internal/util/FileUtility;", "", "Ljava/io/File;", "folder", "Lbn/r;", "printDirectoryTree", "", "indent", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", C3978d4.i.f31327b, "printFile", "", "getIndentString", InneractiveMediationDefs.GENDER_FEMALE, "", "excludeFiles", "delete", "deleteContents", "deleteAndLogIfFailed", "Ljava/io/Serializable;", "serializable", "writeSerializable", "T", "readSerializable", "(Ljava/io/File;)Ljava/lang/Object;", "Ljava/io/Closeable;", "closeable", "closeQuietly", "content", "writeString", "readString", "url", "", "isValidUrl", "", "size", "ext", "guessFileName", "Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "<set-?>", "objectInputStreamProvider", "Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "getObjectInputStreamProvider", "()Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "setObjectInputStreamProvider", "(Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;)V", "TAG", "Ljava/lang/String;", "", "Ljava/lang/Class;", "allowedClasses", "Ljava/util/List;", "getAllowedClasses$vungle_ads_release", "()Ljava/util/List;", "getAllowedClasses$vungle_ads_release$annotations", "()V", "<init>", "ObjectInputStreamProvider", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class FileUtility {

    @NotNull
    private static final String TAG = "FileUtility";

    @NotNull
    public static final FileUtility INSTANCE = new FileUtility();

    @NotNull
    private static ObjectInputStreamProvider objectInputStreamProvider = new ObjectInputStreamProvider() { // from class: com.vungle.ads.internal.util.a
        @Override // com.vungle.ads.internal.util.FileUtility.ObjectInputStreamProvider
        public final ObjectInputStream provideObjectInputStream(InputStream inputStream) {
            return FileUtility.m7367objectInputStreamProvider$lambda0(inputStream);
        }
    };

    @NotNull
    private static final List<Class<?>> allowedClasses = w.p(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    /* JADX INFO: compiled from: FileUtility.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/internal/util/FileUtility$ObjectInputStreamProvider;", "", "provideObjectInputStream", "Ljava/io/ObjectInputStream;", "inputStream", "Ljava/io/InputStream;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ObjectInputStreamProvider {
        @NotNull
        ObjectInputStream provideObjectInputStream(@Nullable InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    private FileUtility() {
    }

    public static final void delete(@Nullable File file, @Nullable Set<String> set) {
        if (file != null) {
            try {
                if (file.exists()) {
                    boolean z10 = true;
                    if (file.isDirectory()) {
                        if (set != null && set.contains(file.getName())) {
                            Logger.INSTANCE.d(TAG, "Skipping deletion of directory: " + file.getName());
                            return;
                        }
                        deleteContents(file, set);
                    }
                    if (set == null || !set.contains(file.getName())) {
                        z10 = false;
                    }
                    if (z10) {
                        Logger.INSTANCE.d(TAG, "Skipping deletion of file: " + file.getName());
                        return;
                    }
                    if (file.delete()) {
                        return;
                    }
                    Logger.INSTANCE.d(TAG, "Failed to delete file: " + file);
                }
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "Failed to delete file: " + e10.getLocalizedMessage());
            }
        }
    }

    public static /* synthetic */ void delete$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        delete(file, set);
    }

    public static final void deleteAndLogIfFailed(@NotNull File file) {
        p.k(file, C3978d4.i.f31327b);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else if (!file.delete()) {
                new AssetFailedToDeleteError("Cannot delete " + file.getName()).logErrorNoReturnValue$vungle_ads_release();
            }
        } catch (Exception e10) {
            new AssetFailedToDeleteError("Failed to delete " + file.getName() + " with error :" + e10.getMessage()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public static final void deleteContents(@NotNull File file, @Nullable Set<String> set) {
        p.k(file, "folder");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            delete(file2, set);
        }
    }

    public static /* synthetic */ void deleteContents$default(File file, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            set = null;
        }
        deleteContents(file, set);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }

    private final String getIndentString(int indent) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < indent; i10++) {
            sb2.append("|  ");
        }
        String string = sb2.toString();
        p.j(string, "sb.toString()");
        return string;
    }

    public static /* synthetic */ String guessFileName$default(FileUtility fileUtility, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return fileUtility.guessFileName(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: objectInputStreamProvider$lambda-0, reason: not valid java name */
    public static final ObjectInputStream m7367objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new SafeObjectInputStream(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(@Nullable File file) {
    }

    private final void printDirectoryTree(File file, int i10, StringBuilder sb2) {
        if (file == null) {
            return;
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("folder is not a Directory".toString());
        }
        sb2.append(getIndentString(i10));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append("/\n");
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                printDirectoryTree(file2, i10 + 1, sb2);
            } else {
                p.j(file2, C3978d4.i.f31327b);
                printFile(file2, i10 + 1, sb2);
            }
        }
    }

    private final void printFile(File file, int i10, StringBuilder sb2) {
        sb2.append(getIndentString(i10));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a3: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:39:0x00a3 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.vungle.ads.internal.util.FileUtility$ObjectInputStreamProvider] */
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
    @Nullable
    public static final <T> T readSerializable(@NotNull File file) {
        Closeable closeable;
        ObjectInputStream objectInputStreamProvideObjectInputStream;
        ?? r12;
        p.k(file, C3978d4.i.f31327b);
        ?? Exists = file.exists();
        Closeable closeable2 = null;
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                Exists = new FileInputStream(file);
                try {
                    objectInputStreamProvideObjectInputStream = objectInputStreamProvider.provideObjectInputStream(Exists);
                    try {
                        T t10 = (T) objectInputStreamProvideObjectInputStream.readObject();
                        ?? r02 = INSTANCE;
                        r02.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r02.closeQuietly(Exists);
                        return t10;
                    } catch (IOException e10) {
                        e = e10;
                        Logger.INSTANCE.e(TAG, "IOException: " + e.getMessage());
                        r12 = Exists;
                        ?? r03 = INSTANCE;
                        r03.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r03.closeQuietly(r12);
                        try {
                            delete$default(file, null, 2, null);
                        } catch (IOException unused) {
                        }
                        return null;
                    } catch (ClassNotFoundException e11) {
                        e = e11;
                        Logger.INSTANCE.e(TAG, "ClassNotFoundException: " + e.getMessage());
                        r12 = Exists;
                        ?? r032 = INSTANCE;
                        r032.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r032.closeQuietly(r12);
                        delete$default(file, null, 2, null);
                        return null;
                    } catch (Exception e12) {
                        e = e12;
                        Logger.INSTANCE.e(TAG, "cannot read serializable " + e.getMessage());
                        r12 = Exists;
                        ?? r0322 = INSTANCE;
                        r0322.closeQuietly(objectInputStreamProvideObjectInputStream);
                        r0322.closeQuietly(r12);
                        delete$default(file, null, 2, null);
                        return null;
                    }
                } catch (IOException e13) {
                    e = e13;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (ClassNotFoundException e14) {
                    e = e14;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Exception e15) {
                    e = e15;
                    objectInputStreamProvideObjectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    ?? r04 = INSTANCE;
                    r04.closeQuietly(closeable2);
                    r04.closeQuietly(Exists);
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (ClassNotFoundException e17) {
                e = e17;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Exception e18) {
                e = e18;
                Exists = 0;
                objectInputStreamProvideObjectInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                Exists = 0;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable2 = closeable;
        }
    }

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
    public static final void writeSerializable(@NotNull File file, @Nullable Serializable serializable) {
        OutputStream outputStreamFileOutputStreamCtor;
        ObjectOutputStream objectOutputStream;
        p.k(file, C3978d4.i.f31327b);
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            outputStreamFileOutputStreamCtor = LiftoffMonetizeFilesBridge.fileOutputStreamCtor(file);
        } catch (IOException e10) {
            e = e10;
            objectOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            outputStreamFileOutputStreamCtor = null;
        }
        try {
            objectOutputStream = new ObjectOutputStream(outputStreamFileOutputStreamCtor);
            try {
                objectOutputStream.writeObject(serializable);
                objectOutputStream.reset();
                FileUtility fileUtility = INSTANCE;
                fileUtility.closeQuietly(objectOutputStream);
                fileUtility.closeQuietly(outputStreamFileOutputStreamCtor);
            } catch (IOException e11) {
                e = e11;
                outputStream = outputStreamFileOutputStreamCtor;
                try {
                    Logger.INSTANCE.e(TAG, String.valueOf(e.getMessage()));
                    FileUtility fileUtility2 = INSTANCE;
                    fileUtility2.closeQuietly(objectOutputStream);
                    fileUtility2.closeQuietly(outputStream);
                } catch (Throwable th3) {
                    th = th3;
                    outputStreamFileOutputStreamCtor = outputStream;
                    outputStream = objectOutputStream;
                    FileUtility fileUtility3 = INSTANCE;
                    fileUtility3.closeQuietly(outputStream);
                    fileUtility3.closeQuietly(outputStreamFileOutputStreamCtor);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                outputStream = objectOutputStream;
                FileUtility fileUtility32 = INSTANCE;
                fileUtility32.closeQuietly(outputStream);
                fileUtility32.closeQuietly(outputStreamFileOutputStreamCtor);
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            objectOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            FileUtility fileUtility322 = INSTANCE;
            fileUtility322.closeQuietly(outputStream);
            fileUtility322.closeQuietly(outputStreamFileOutputStreamCtor);
            throw th;
        }
    }

    public final void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @NotNull
    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    @VisibleForTesting
    @NotNull
    public final ObjectInputStreamProvider getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    @NotNull
    public final String guessFileName(@NotNull String url, @Nullable String ext) {
        p.k(url, "url");
        String strGuessFileName = URLUtil.guessFileName(url, null, ext);
        p.j(strGuessFileName, "guessFileName(url, null, ext)");
        return strGuessFileName;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isValidUrl(@org.jetbrains.annotations.Nullable java.lang.String r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto Ld
            boolean r2 = bo.d0.u0(r4)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = r1
            goto Le
        Ld:
            r2 = r0
        Le:
            if (r2 != 0) goto L19
            okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion     // Catch: java.lang.Throwable -> L1b
            okhttp3.HttpUrl r4 = r2.parse(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r0 = r1
        L1a:
            r1 = r0
        L1b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.util.FileUtility.isValidUrl(java.lang.String):boolean");
    }

    @Nullable
    public final String readString(@NotNull File file) {
        p.k(file, C3978d4.i.f31327b);
        if (!file.exists()) {
            return null;
        }
        try {
            return g.l(file, null, 1, null);
        } catch (IOException e10) {
            Logger.INSTANCE.e(TAG, "IOException: " + e10.getMessage());
            return null;
        } catch (Exception e11) {
            Logger.INSTANCE.e(TAG, "cannot read string " + e11.getMessage());
            return null;
        }
    }

    @VisibleForTesting
    public final void setObjectInputStreamProvider(@NotNull ObjectInputStreamProvider objectInputStreamProvider2) {
        p.k(objectInputStreamProvider2, "<set-?>");
        objectInputStreamProvider = objectInputStreamProvider2;
    }

    public final long size(@Nullable File file) {
        long size = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            if (!(fileArrListFiles.length == 0)) {
                for (File file2 : fileArrListFiles) {
                    size += size(file2);
                }
            }
        }
        return size;
    }

    public final void writeString(@NotNull File file, @Nullable String str) {
        p.k(file, C3978d4.i.f31327b);
        if (str == null) {
            return;
        }
        try {
            g.n(file, str, bo.c.f5639b);
        } catch (IOException e10) {
            Logger.INSTANCE.e(TAG, String.valueOf(e10.getMessage()));
        }
    }
}
