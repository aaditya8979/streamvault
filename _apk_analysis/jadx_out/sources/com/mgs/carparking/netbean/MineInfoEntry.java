package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MineInfoEntry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MineInfoEntry {

    @Nullable
    private String firstName;

    @Nullable
    private List<MenuList> menuList;

    @Nullable
    private String secondName;
    private int userId;

    @Nullable
    private String userName;

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final List<MenuList> getMenuList() {
        return this.menuList;
    }

    @Nullable
    public final String getSecondName() {
        return this.secondName;
    }

    public final int getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    public final void setFirstName(@Nullable String str) {
        this.firstName = str;
    }

    public final void setMenuList(@Nullable List<MenuList> list) {
        this.menuList = list;
    }

    public final void setSecondName(@Nullable String str) {
        this.secondName = str;
    }

    public final void setUserId(int i10) {
        this.userId = i10;
    }

    public final void setUserName(@Nullable String str) {
        this.userName = str;
    }
}
