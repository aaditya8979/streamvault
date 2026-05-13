package io.bidmachine.rendering.internal.repository;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import bn.r;
import com.ironsource.C3978d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.internal.repository.a;
import io.bidmachine.rendering.model.Base64MediaSource;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.UrlMediaSource;
import io.bidmachine.rendering.utils.FileUtils;
import io.bidmachine.rendering.utils.NetworkRequest;
import io.bidmachine.util.ImageUtils;
import io.bidmachine.util.Utils;
import io.bidmachine.util.UtilsKt;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000do.l0;
import tn.p;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements io.bidmachine.rendering.internal.repository.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f70516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.h f70517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f70518c;

    public static final class a extends NetworkRequest.FileOutputStreamProcessor {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final BitmapFactory.Options f70519c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, File file, BitmapFactory.Options options) {
            super(context, file);
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(file, C3978d4.i.f31327b);
            p.k(options, "options");
            this.f70519c = options;
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.FileOutputStreamProcessor, io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap transform(File file) {
            p.k(file, C3978d4.i.f31327b);
            return ImageUtils.decodeFileToBitmapSafely(file, this.f70519c);
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.repository.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0836b implements NetworkRequest.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0835a f70520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l0 f70521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final io.bidmachine.rendering.internal.h f70522c;

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.repository.b$b$a */
        public static final class a extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70523a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Error f70525c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Error error, hn.c cVar) {
                super(2, cVar);
                this.f70525c = error;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((a) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return AbstractC0836b.this.new a(this.f70525c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70523a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                AbstractC0836b.this.f70520a.onError(this.f70525c);
                return r.f5635a;
            }
        }

        /* JADX INFO: renamed from: io.bidmachine.rendering.internal.repository.b$b$b, reason: collision with other inner class name */
        public static final class C0837b extends SuspendLambda implements sn.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f70526a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f70528c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0837b(Object obj, hn.c cVar) {
                super(2, cVar);
                this.f70528c = obj;
            }

            @Override // sn.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo2invoke(l0 l0Var, hn.c cVar) {
                return ((C0837b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final hn.c create(Object obj, hn.c cVar) {
                return AbstractC0836b.this.new C0837b(this.f70528c, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                in.a.g();
                if (this.f70526a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
                AbstractC0836b.this.f70520a.onSuccess(this.f70528c);
                return r.f5635a;
            }
        }

        public AbstractC0836b(a.InterfaceC0835a interfaceC0835a, l0 l0Var, io.bidmachine.rendering.internal.h hVar) {
            p.k(interfaceC0835a, "resultCallback");
            p.k(l0Var, "coroutineScope");
            p.k(hVar, "coroutineDispatchers");
            this.f70520a = interfaceC0835a;
            this.f70521b = l0Var;
            this.f70522c = hVar;
        }

        public abstract Error a();

        @Override // io.bidmachine.rendering.utils.NetworkRequest.Listener
        public void onError(Error error) {
            p.k(error, "error");
            p000do.i.d(this.f70521b, this.f70522c.d(), null, new a(error, null), 2, null);
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.Listener
        public void onSuccess(Object obj) {
            if (obj != null) {
                p000do.i.d(this.f70521b, this.f70522c.d(), null, new C0837b(obj, null), 2, null);
            } else {
                onError(a());
            }
        }
    }

    public static final class c extends NetworkRequest.FileOutputStreamProcessor {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, File file) {
            super(context, file);
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(file, C3978d4.i.f31327b);
        }

        @Override // io.bidmachine.rendering.utils.NetworkRequest.FileOutputStreamProcessor, io.bidmachine.rendering.utils.NetworkRequest.ResponseTransformer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Uri transform(File file) {
            p.k(file, C3978d4.i.f31327b);
            if (FileUtils.isEmpty(file)) {
                return null;
            }
            return FileUtils.toUri(file);
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70529a;

        static {
            int[] iArr = new int[MediaSource.DeliveryType.values().length];
            try {
                iArr[MediaSource.DeliveryType.PRELOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaSource.DeliveryType.STREAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f70529a = iArr;
        }
    }

    public static final class e extends SuspendLambda implements sn.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0835a f70531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Error f70532c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(a.InterfaceC0835a interfaceC0835a, Error error, hn.c cVar) {
            super(2, cVar);
            this.f70531b = interfaceC0835a;
            this.f70532c = error;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((e) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            return new e(this.f70531b, this.f70532c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70530a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f70531b.onError(this.f70532c);
            return r.f5635a;
        }
    }

    public static final class f extends SuspendLambda implements sn.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0835a f70534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f70535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a.InterfaceC0835a interfaceC0835a, Object obj, hn.c cVar) {
            super(2, cVar);
            this.f70534b = interfaceC0835a;
            this.f70535c = obj;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((f) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            return new f(this.f70534b, this.f70535c, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            in.a.g();
            if (this.f70533a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
            this.f70534b.onSuccess(this.f70535c);
            return r.f5635a;
        }
    }

    public static final class g extends SuspendLambda implements sn.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70536a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediaSource f70538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0835a f70539d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MediaSource mediaSource, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
            super(2, cVar);
            this.f70538c = mediaSource;
            this.f70539d = interfaceC0835a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((g) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            return b.this.new g(this.f70538c, this.f70539d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f70536a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                b bVar = b.this;
                MediaSource mediaSource = this.f70538c;
                a.InterfaceC0835a interfaceC0835a = this.f70539d;
                this.f70536a = 1;
                if (bVar.a(mediaSource, interfaceC0835a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public static final class h extends SuspendLambda implements sn.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaSource f70541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f70542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0835a f70543d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MediaSource mediaSource, b bVar, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
            super(2, cVar);
            this.f70541b = mediaSource;
            this.f70542c = bVar;
            this.f70543d = interfaceC0835a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((h) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            return new h(this.f70541b, this.f70542c, this.f70543d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f70540a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                BitmapFactory.Options optionsCreateDefaultBitmapFactoryOptions = ImageUtils.createDefaultBitmapFactoryOptions();
                optionsCreateDefaultBitmapFactoryOptions.inJustDecodeBounds = false;
                MediaSource mediaSource = this.f70541b;
                if (mediaSource instanceof UrlMediaSource) {
                    a.InterfaceC0835a interfaceC0835a = this.f70543d;
                    this.f70540a = 1;
                    if (this.f70542c.a((UrlMediaSource) mediaSource, optionsCreateDefaultBitmapFactoryOptions, interfaceC0835a, this) == objG) {
                        return objG;
                    }
                } else if (mediaSource instanceof Base64MediaSource) {
                    a.InterfaceC0835a interfaceC0835a2 = this.f70543d;
                    this.f70540a = 2;
                    if (this.f70542c.a((Base64MediaSource) mediaSource, optionsCreateDefaultBitmapFactoryOptions, interfaceC0835a2, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public static final class i extends SuspendLambda implements sn.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70544a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediaSource f70546c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0835a f70547d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MediaSource mediaSource, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
            super(2, cVar);
            this.f70546c = mediaSource;
            this.f70547d = interfaceC0835a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((i) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            return b.this.new i(this.f70546c, this.f70547d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f70544a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                b bVar = b.this;
                MediaSource mediaSource = this.f70546c;
                a.InterfaceC0835a interfaceC0835a = this.f70547d;
                this.f70544a = 1;
                if (bVar.b(mediaSource, interfaceC0835a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public static final class j extends SuspendLambda implements sn.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaSource f70549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f70550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0835a f70551d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MediaSource mediaSource, b bVar, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
            super(2, cVar);
            this.f70549b = mediaSource;
            this.f70550c = bVar;
            this.f70551d = interfaceC0835a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((j) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            return new j(this.f70549b, this.f70550c, this.f70551d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f70548a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MediaSource mediaSource = this.f70549b;
                if (mediaSource instanceof UrlMediaSource) {
                    this.f70550c.a(((UrlMediaSource) mediaSource).getUrl(), new NetworkRequest.StringProcessor(), this.f70551d, new Error("Uri is null"));
                } else if (mediaSource instanceof Base64MediaSource) {
                    String strDecodeBase64ToString$default = Utils.decodeBase64ToString$default(((Base64MediaSource) mediaSource).getBase64(), 0, 2, (Object) null);
                    if (strDecodeBase64ToString$default != null) {
                        b bVar = this.f70550c;
                        a.InterfaceC0835a interfaceC0835a = this.f70551d;
                        this.f70548a = 1;
                        if (bVar.a(interfaceC0835a, strDecodeBase64ToString$default, this) == objG) {
                            return objG;
                        }
                    } else {
                        b bVar2 = this.f70550c;
                        a.InterfaceC0835a interfaceC0835a2 = this.f70551d;
                        Error error = new Error("Can't decode string from base64");
                        this.f70548a = 2;
                        if (bVar2.a(interfaceC0835a2, error, (hn.c) this) == objG) {
                            return objG;
                        }
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public static final class k extends SuspendLambda implements sn.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70552a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediaSource f70554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0835a f70555d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MediaSource mediaSource, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
            super(2, cVar);
            this.f70554c = mediaSource;
            this.f70555d = interfaceC0835a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((k) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            return b.this.new k(this.f70554c, this.f70555d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f70552a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                b bVar = b.this;
                MediaSource mediaSource = this.f70554c;
                a.InterfaceC0835a interfaceC0835a = this.f70555d;
                this.f70552a = 1;
                if (bVar.c(mediaSource, interfaceC0835a, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public static final class l extends SuspendLambda implements sn.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaSource f70557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f70558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0835a f70559d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MediaSource mediaSource, b bVar, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
            super(2, cVar);
            this.f70557b = mediaSource;
            this.f70558c = bVar;
            this.f70559d = interfaceC0835a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((l) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            return new l(this.f70557b, this.f70558c, this.f70559d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f70556a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MediaSource mediaSource = this.f70557b;
                if (mediaSource instanceof UrlMediaSource) {
                    a.InterfaceC0835a interfaceC0835a = this.f70559d;
                    this.f70556a = 1;
                    if (this.f70558c.a((UrlMediaSource) mediaSource, interfaceC0835a, (hn.c) this) == objG) {
                        return objG;
                    }
                } else {
                    this.f70559d.onError(new Error("Unsupported media source type: " + this.f70557b));
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public static final class m extends SuspendLambda implements sn.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70560a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f70562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0835a f70563d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
            super(2, cVar);
            this.f70562c = str;
            this.f70563d = interfaceC0835a;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c cVar) {
            return ((m) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c create(Object obj, hn.c cVar) {
            return b.this.new m(this.f70562c, this.f70563d, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f70560a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                Uri uriB = b.this.b(this.f70562c);
                if (uriB != null) {
                    b bVar = b.this;
                    a.InterfaceC0835a interfaceC0835a = this.f70563d;
                    this.f70560a = 1;
                    if (bVar.a(interfaceC0835a, uriB, this) == objG) {
                        return objG;
                    }
                } else {
                    b bVar2 = b.this;
                    a.InterfaceC0835a interfaceC0835a2 = this.f70563d;
                    Error error = new Error("Can't parse video stream url - " + this.f70562c);
                    this.f70560a = 2;
                    if (bVar2.a(interfaceC0835a2, error, (hn.c) this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public static final class n extends AbstractC0836b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Error f70564d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(a.InterfaceC0835a interfaceC0835a, Error error, l0 l0Var, io.bidmachine.rendering.internal.h hVar) {
            super(interfaceC0835a, l0Var, hVar);
            this.f70564d = error;
        }

        @Override // io.bidmachine.rendering.internal.repository.b.AbstractC0836b
        public Error a() {
            return this.f70564d;
        }
    }

    public b(Context context, l0 l0Var, io.bidmachine.rendering.internal.h hVar) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(l0Var, "coroutineScope");
        p.k(hVar, "coroutineDispatchers");
        this.f70516a = l0Var;
        this.f70517b = hVar;
        this.f70518c = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(a.InterfaceC0835a interfaceC0835a, Error error, hn.c cVar) {
        Object objG = p000do.g.g(this.f70517b.d(), new e(interfaceC0835a, error, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(a.InterfaceC0835a interfaceC0835a, Object obj, hn.c cVar) {
        Object objG = p000do.g.g(this.f70517b.d(), new f(interfaceC0835a, obj, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    public final Bitmap a(String str, BitmapFactory.Options options) {
        p.k(str, "base64");
        p.k(options, "options");
        byte[] bArrDecodeBase64$default = UtilsKt.decodeBase64$default(str, 0, 1, (Object) null);
        if (bArrDecodeBase64$default != null) {
            return ImageUtils.decodeBytesToBitmapSafely(bArrDecodeBase64$default, options);
        }
        return null;
    }

    public final NetworkRequest.FileOutputStreamProcessor a(Context context, File file) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(file, C3978d4.i.f31327b);
        return new c(context, file);
    }

    public final NetworkRequest.FileOutputStreamProcessor a(Context context, File file, BitmapFactory.Options options) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(file, C3978d4.i.f31327b);
        p.k(options, "options");
        return new a(context, file, options);
    }

    public final File a(String str) {
        p.k(str, "url");
        return FileUtils.getFileByUrl(this.f70518c, str);
    }

    public final Object a(Base64MediaSource base64MediaSource, BitmapFactory.Options options, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
        Bitmap bitmapA = a(base64MediaSource.getBase64(), options);
        if (bitmapA != null) {
            Object objA = a(interfaceC0835a, bitmapA, cVar);
            return objA == in.a.g() ? objA : r.f5635a;
        }
        Object objA2 = a(interfaceC0835a, new Error("Can't decode image from base64"), cVar);
        return objA2 == in.a.g() ? objA2 : r.f5635a;
    }

    public final Object a(MediaSource mediaSource, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
        Object objG = p000do.g.g(this.f70517b.c(), new h(mediaSource, this, interfaceC0835a, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    public final Object a(UrlMediaSource urlMediaSource, BitmapFactory.Options options, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
        String url = urlMediaSource.getUrl();
        File fileA = a(url);
        if (fileA == null) {
            Object objA = a(interfaceC0835a, new Error("Can't create file for image by url (" + url + ')'), cVar);
            return objA == in.a.g() ? objA : r.f5635a;
        }
        Context context = this.f70518c;
        p.j(context, "applicationContext");
        NetworkRequest.FileOutputStreamProcessor fileOutputStreamProcessorA = a(context, fileA, options);
        Bitmap bitmap = (Bitmap) fileOutputStreamProcessorA.transform(fileA);
        if (bitmap != null) {
            Object objA2 = a(interfaceC0835a, bitmap, cVar);
            return objA2 == in.a.g() ? objA2 : r.f5635a;
        }
        a(url, fileOutputStreamProcessorA, interfaceC0835a, new Error("Failed to load image from url (" + url + ')'));
        return r.f5635a;
    }

    public final Object a(UrlMediaSource urlMediaSource, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
        Object objB;
        String url = urlMediaSource.getUrl();
        int i10 = d.f70529a[urlMediaSource.getDeliveryType().ordinal()];
        if (i10 != 1) {
            return (i10 == 2 && (objB = b(url, interfaceC0835a, cVar)) == in.a.g()) ? objB : r.f5635a;
        }
        Object objA = a(url, interfaceC0835a, cVar);
        return objA == in.a.g() ? objA : r.f5635a;
    }

    public final Object a(String str, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
        File fileA = a(str);
        if (fileA == null) {
            Object objA = a(interfaceC0835a, new Error("Can't create file for video by url (" + str + ')'), cVar);
            return objA == in.a.g() ? objA : r.f5635a;
        }
        Context context = this.f70518c;
        p.j(context, "applicationContext");
        NetworkRequest.FileOutputStreamProcessor fileOutputStreamProcessorA = a(context, fileA);
        Uri uri = (Uri) fileOutputStreamProcessorA.transform(fileA);
        if (uri != null) {
            Object objA2 = a(interfaceC0835a, uri, cVar);
            return objA2 == in.a.g() ? objA2 : r.f5635a;
        }
        a(str, fileOutputStreamProcessorA, interfaceC0835a, new Error("Uri is null"));
        return r.f5635a;
    }

    @Override // io.bidmachine.rendering.internal.repository.a
    public void a(MediaSource mediaSource, a.InterfaceC0835a interfaceC0835a) {
        p.k(mediaSource, "mediaSource");
        p.k(interfaceC0835a, "resultCallback");
        p000do.i.d(this.f70516a, null, null, new i(mediaSource, interfaceC0835a, null), 3, null);
    }

    public final void a(String str, NetworkRequest.ResponseProcessor responseProcessor, a.InterfaceC0835a interfaceC0835a, Error error) {
        p.k(str, "url");
        p.k(responseProcessor, "processor");
        p.k(interfaceC0835a, "resultCallback");
        p.k(error, "error");
        new NetworkRequest.Builder(str, NetworkRequest.Method.Get).setResponseTransformer(responseProcessor).setListener(new n(interfaceC0835a, error, this.f70516a, this.f70517b)).send();
    }

    public final Uri b(String str) {
        p.k(str, "url");
        try {
            return Utils.getValidUri(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Object b(MediaSource mediaSource, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
        Object objG = p000do.g.g(this.f70517b.c(), new j(mediaSource, this, interfaceC0835a, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    public final Object b(String str, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
        Object objG = p000do.g.g(this.f70517b.c(), new m(str, interfaceC0835a, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    @Override // io.bidmachine.rendering.internal.repository.a
    public void b(MediaSource mediaSource, a.InterfaceC0835a interfaceC0835a) {
        p.k(mediaSource, "mediaSource");
        p.k(interfaceC0835a, "resultCallback");
        p000do.i.d(this.f70516a, null, null, new g(mediaSource, interfaceC0835a, null), 3, null);
    }

    public final Object c(MediaSource mediaSource, a.InterfaceC0835a interfaceC0835a, hn.c cVar) {
        Object objG = p000do.g.g(this.f70517b.c(), new l(mediaSource, this, interfaceC0835a, null), cVar);
        return objG == in.a.g() ? objG : r.f5635a;
    }

    @Override // io.bidmachine.rendering.internal.repository.a
    public void c(MediaSource mediaSource, a.InterfaceC0835a interfaceC0835a) {
        p.k(mediaSource, "mediaSource");
        p.k(interfaceC0835a, "resultCallback");
        p000do.i.d(this.f70516a, null, null, new k(mediaSource, interfaceC0835a, null), 3, null);
    }
}
