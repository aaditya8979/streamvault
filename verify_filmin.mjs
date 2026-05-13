import { getFilminClient, FilminClient } from "./lib/filmin.ts";

async function test() {
  console.log("🚀 Testing Filmin Integration...");
  const client = getFilminClient();

  try {
    console.log("\n1. Searching for 'Invincible'...");
    const results = await client.search("Invincible");
    console.log(`Found ${results.length} results.`);

    if (results.length > 0) {
      const first = results[0];
      console.log(`\n2. First result: ${first.vod_name}`);
      console.log(`   Filmin ID: ${first.id}`);
      console.log(`   TMDB ID: ${FilminClient.getTmdbId(first)}`);
      console.log(`   Media Type: ${FilminClient.getMediaType(first)}`);

      console.log(`\n3. Fetching detailed info for ID ${first.id}...`);
      const detail = await client.getVodInfo(first.id);
      console.log(`   Full Title: ${detail.vod_name}`);
      console.log(`   Year: ${detail.vod_year}`);
      console.log(`   Episodes: ${detail.vod_collection?.length}`);
      
      if (detail.vod_collection?.length > 0) {
        console.log(`   First Episode Title: ${detail.vod_collection[0].title}`);
      }
    }

    console.log("\n4. Testing Hot Search...");
    const hot = await client.getHotSearch();
    console.log(`Found ${hot.length} hot items.`);
    console.log(`Top hot item: ${hot[0].vod_name}`);

    console.log("\n✅ Integration Verified!");
  } catch (error) {
    console.error("\n❌ Integration Test Failed:");
    console.error(error);
  }
}

test();
