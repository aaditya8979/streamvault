package kotlin.io;

import kn.a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes.dex */
public final class FileWalkDirection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ FileWalkDirection[] f73234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f73235c;
    public static final FileWalkDirection TOP_DOWN = new FileWalkDirection("TOP_DOWN", 0);
    public static final FileWalkDirection BOTTOM_UP = new FileWalkDirection("BOTTOM_UP", 1);

    static {
        FileWalkDirection[] fileWalkDirectionArrD = d();
        f73234b = fileWalkDirectionArrD;
        f73235c = kotlin.enums.a.a(fileWalkDirectionArrD);
    }

    public FileWalkDirection(String str, int i10) {
    }

    public static final /* synthetic */ FileWalkDirection[] d() {
        return new FileWalkDirection[]{TOP_DOWN, BOTTOM_UP};
    }

    @NotNull
    public static a<FileWalkDirection> getEntries() {
        return f73235c;
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) Enum.valueOf(FileWalkDirection.class, str);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) f73234b.clone();
    }
}
