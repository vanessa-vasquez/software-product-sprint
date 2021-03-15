// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/** Fetches my spotify playlist from the server and adds it to the page. */
async function showSpotifyLink() {
  const responseFromServer = await fetch('/spotify-servlet');
  const textFromResponse = await responseFromServer.text();

  const spotifyContainer = document.getElementById('spotify-container');
  spotifyContainer.innerText = textFromResponse;
}

async function showJSON(){
    const responseFromServer = await fetch('/custom-servlet');

    const myObject = await responseFromServer.json(); 

    const funFactContainer = document.getElementById('fun-facts-container');
    
    console.log(myObject[0]);

    funFactContainer.innerHTML = '';

    funFactContainer.appendChild(createListElement(myObject[0]));    
}

/** Creates an <li> element containing text. */
function createListElement(text) {
  const liElement = document.createElement('li');
  liElement.innerText = text;
  return liElement;
}

/** Creates a map and adds it to the page. */
function createMap() {
  const map = new google.maps.Map(
      document.getElementById('map'),
      {center: {lat: 37.422, lng: -122.084}, zoom: 16});
}


