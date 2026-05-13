package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UpdateEvent.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class UpdateEvent {
    private int code;

    @Nullable
    private String message;

    @Nullable
    private UpdateData result;

    /* JADX INFO: compiled from: UpdateEvent.kt */
    public final class UpdateData {

        @Nullable
        private String channel_code;
        private int force_upgrade;

        @Nullable
        private String google_id;

        @Nullable
        private String packagesize;

        @Nullable
        private String sys_platform;

        @Nullable
        private String text;

        @Nullable
        private String url;
        private int version;

        @Nullable
        private String version_name;

        public UpdateData() {
        }

        @Nullable
        public final String getChannel_code() {
            return this.channel_code;
        }

        public final int getForce_upgrade() {
            return this.force_upgrade;
        }

        @Nullable
        public final String getGoogle_id() {
            return this.google_id;
        }

        @Nullable
        public final String getPackagesize() {
            return this.packagesize;
        }

        @Nullable
        public final String getSys_platform() {
            return this.sys_platform;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final int getVersion() {
            return this.version;
        }

        @Nullable
        public final String getVersion_name() {
            return this.version_name;
        }

        public final void setChannel_code(@Nullable String str) {
            this.channel_code = str;
        }

        public final void setForce_upgrade(int i10) {
            this.force_upgrade = i10;
        }

        public final void setGoogle_id(@Nullable String str) {
            this.google_id = str;
        }

        public final void setPackagesize(@Nullable String str) {
            this.packagesize = str;
        }

        public final void setSys_platform(@Nullable String str) {
            this.sys_platform = str;
        }

        public final void setText(@Nullable String str) {
            this.text = str;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }

        public final void setVersion(int i10) {
            this.version = i10;
        }

        public final void setVersion_name(@Nullable String str) {
            this.version_name = str;
        }
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final UpdateData getResult() {
        return this.result;
    }

    public final void setCode(int i10) {
        this.code = i10;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setResult(@Nullable UpdateData updateData) {
        this.result = updateData;
    }
}
