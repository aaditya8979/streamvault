import Link from "next/link";
export default function NotFound() {
  return (
    <div className="min-h-screen flex flex-col items-center justify-center gap-4 text-center px-4">
      <p className="text-8xl font-black text-zinc-800">404</p>
      <p className="text-xl font-semibold text-zinc-200">Page not found</p>
      <Link href="/" className="mt-2 px-5 py-2.5 bg-red-600 text-white rounded-lg text-sm font-medium hover:bg-red-500 transition-colors">
        Go Home
      </Link>
    </div>
  );
}
