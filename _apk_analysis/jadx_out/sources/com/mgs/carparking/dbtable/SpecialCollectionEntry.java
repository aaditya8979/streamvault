package com.mgs.carparking.dbtable;

import androidx.databinding.BaseObservable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import up.b;
import up.f;

/* JADX INFO: compiled from: SpecialCollectionEntry.kt */
/* JADX INFO: loaded from: classes2.dex */
@f(name = SpecialCollectionEntry.TABLE_NAME)
public final class SpecialCollectionEntry extends BaseObservable {

    @NotNull
    public static final String CONTENT = "content";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ICON = "icon";

    @NotNull
    public static final String ID = "id";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String TABLE_NAME = "special_collection";

    @NotNull
    public static final String USER_NUM = "user_num";

    @b(name = "content")
    @Nullable
    private String content;

    @b(name = "icon")
    @Nullable
    private String icon;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @b(name = "id")
    private int f43850id;

    @b(name = "name")
    @Nullable
    private String name;

    @b(name = USER_NUM)
    private int user_num;

    /* JADX INFO: compiled from: SpecialCollectionEntry.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.f43850id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getUser_num() {
        return this.user_num;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setId(int i10) {
        this.f43850id = i10;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setUser_num(int i10) {
        this.user_num = i10;
    }

    @NotNull
    public String toString() {
        return "SpecialCollectionEntry{id=" + this.f43850id + ", name='" + this.name + "', icon='" + this.icon + "', user_num=" + this.user_num + ", content='" + this.content + "'}";
    }
}
