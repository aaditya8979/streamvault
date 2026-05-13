package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MineUserInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class MineUserInfo {

    @Nullable
    private String account;

    @Nullable
    private List<SelectorAgeEntry> age_list;

    @Nullable
    private String app_id;

    @Nullable
    private String birthday;
    private int has_feedback;

    @Nullable
    private String head_img;

    @Nullable
    private String intro;
    private int invited_count;
    private float invited_reward;
    private int is_svip;
    private int is_update;
    private int is_vip;

    @Nullable
    private String nickname;

    @Nullable
    private String phone;
    private int sex;
    private long svip_validity;
    private int user_id;
    private long vip_validity;

    @Nullable
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final List<SelectorAgeEntry> getAge_list() {
        return this.age_list;
    }

    @Nullable
    public final String getApp_id() {
        return this.app_id;
    }

    @Nullable
    public final String getBirthday() {
        return this.birthday;
    }

    public final int getHas_feedback() {
        return this.has_feedback;
    }

    @Nullable
    public final String getHead_img() {
        return this.head_img;
    }

    @Nullable
    public final String getIntro() {
        return this.intro;
    }

    public final int getInvited_count() {
        return this.invited_count;
    }

    public final float getInvited_reward() {
        return this.invited_reward;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    public final int getSex() {
        return this.sex;
    }

    public final long getSvip_validity() {
        return this.svip_validity;
    }

    public final int getUser_id() {
        return this.user_id;
    }

    public final long getVip_validity() {
        return this.vip_validity;
    }

    public final int is_svip() {
        return this.is_svip;
    }

    public final int is_update() {
        return this.is_update;
    }

    public final int is_vip() {
        return this.is_vip;
    }

    public final void setAccount(@Nullable String str) {
        this.account = str;
    }

    public final void setAge_list(@Nullable List<SelectorAgeEntry> list) {
        this.age_list = list;
    }

    public final void setApp_id(@Nullable String str) {
        this.app_id = str;
    }

    public final void setBirthday(@Nullable String str) {
        this.birthday = str;
    }

    public final void setHas_feedback(int i10) {
        this.has_feedback = i10;
    }

    public final void setHead_img(@Nullable String str) {
        this.head_img = str;
    }

    public final void setIntro(@Nullable String str) {
        this.intro = str;
    }

    public final void setInvited_count(int i10) {
        this.invited_count = i10;
    }

    public final void setInvited_reward(float f10) {
        this.invited_reward = f10;
    }

    public final void setNickname(@Nullable String str) {
        this.nickname = str;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setSex(int i10) {
        this.sex = i10;
    }

    public final void setSvip_validity(long j10) {
        this.svip_validity = j10;
    }

    public final void setUser_id(int i10) {
        this.user_id = i10;
    }

    public final void setVip_validity(long j10) {
        this.vip_validity = j10;
    }

    public final void set_svip(int i10) {
        this.is_svip = i10;
    }

    public final void set_update(int i10) {
        this.is_update = i10;
    }

    public final void set_vip(int i10) {
        this.is_vip = i10;
    }
}
