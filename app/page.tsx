import Home from "@/components/Home";

// This page has NO server-side data fetching.
// Everything is fetched client-side → zero server timeout risk.
export default function Page() {
  return <Home />;
}
