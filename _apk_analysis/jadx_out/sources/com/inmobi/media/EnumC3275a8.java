package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC3275a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC3275a8[] f26763a;

    static {
        EnumC3275a8[] enumC3275a8Arr = {new EnumC3275a8("CREATE_VIDEO_PLAYER", 0, "createVideoPlayer"), new EnumC3275a8("EXECUTE_VIDEO_PLAYER_ACTION", 1, "executeVideoPlayerActions"), new EnumC3275a8("UPDATE_VIDEO_PLAYER_POSITION", 2, "updateVideoPlayerPosition"), new EnumC3275a8("GET_VIDEO_PLAYER_STATE", 3, "getVideoPlayerState"), new EnumC3275a8("UNKNOWN", 4, "unknown")};
        f26763a = enumC3275a8Arr;
        kotlin.enums.a.a(enumC3275a8Arr);
    }

    public EnumC3275a8(String str, int i10, String str2) {
    }

    public static EnumC3275a8 valueOf(String str) {
        return (EnumC3275a8) Enum.valueOf(EnumC3275a8.class, str);
    }

    public static EnumC3275a8[] values() {
        return (EnumC3275a8[]) f26763a.clone();
    }
}
