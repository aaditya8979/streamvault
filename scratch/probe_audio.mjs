
import { getFilminClient } from "./lib/filmin.js";
import fs from "fs";

async function probe() {
  const client = getFilminClient();
  const vodId = 245962; // My Demon
  console.log(`Probing VOD ${vodId}...`);

  for (let i = 0; i <= 5; i++) {
    try {
      const info = await client.getStreamInfo(vodId, i);
      console.log(`\nAudio Type ${i}:`);
      console.log(`  Title: ${info.vod_name}`);
      console.log(`  Audio Lang Tag: ${info.audio_language_tag}`);
      if (info.audio_type_option) {
        console.log(`  Options: ${JSON.stringify(info.audio_type_option)}`);
      }
      if (info.vod_collection && info.vod_collection[0]) {
        console.log(`  URL: ${info.vod_collection[0].vod_url.substring(0, 100)}...`);
      }
    } catch (e) {
      console.log(`\nAudio Type ${i} failed: ${e.message}`);
    }
  }
}

probe();
