-- -- -- INSERT PLANETS
BEGIN;
INSERT INTO planet (id, name) VALUES ('Tatooine');
INSERT INTO planet (id, name) VALUES ('Alderaan');
INSERT INTO planet (id, name) VALUES ('Yavin IV');
INSERT INTO planet (id, name) VALUES ('Hoth');
INSERT INTO planet (id, name) VALUES ('Dagobah');
INSERT INTO planet (id, name) VALUES ('Bespin');
INSERT INTO planet (id, name) VALUES ('Endor');
INSERT INTO planet (id, name) VALUES ('Naboo');
INSERT INTO planet (id, name) VALUES ('Coruscant');
INSERT INTO planet (id, name) VALUES ('Kamino');
INSERT INTO planet (id, name) VALUES ('Geonosis');
INSERT INTO planet (id, name) VALUES ('Utapau');
INSERT INTO planet (id, name) VALUES ('Mustafar');
INSERT INTO planet (id, name) VALUES ('Kashyyyk');
INSERT INTO planet (id, name) VALUES ('Polis Massa');
INSERT INTO planet (id, name) VALUES ('Mygeeto');
INSERT INTO planet (id, name) VALUES ('Felucia');
INSERT INTO planet (id, name) VALUES ('Cato Neimoidia');
INSERT INTO planet (id, name) VALUES ('Saleucami');
INSERT INTO planet (id, name) VALUES ('Stewjon');
INSERT INTO planet (id, name) VALUES ('Eriadu');
INSERT INTO planet (id, name) VALUES ('Corellia');
INSERT INTO planet (id, name) VALUES ('Rodia');
INSERT INTO planet (id, name) VALUES ('Nal Hutta');
INSERT INTO planet (id, name) VALUES ('Dantooine');
INSERT INTO planet (id, name) VALUES ('Bestine IV');
INSERT INTO planet (id, name) VALUES ('Ord Mantell');
INSERT INTO planet (id, name) VALUES ('UNKNOWN');
INSERT INTO planet (id, name) VALUES ('Trandosha');
INSERT INTO planet (id, name) VALUES ('Socorro');
INSERT INTO planet (id, name) VALUES ('Mon Cala');
INSERT INTO planet (id, name) VALUES ('Chandrila');
INSERT INTO planet (id, name) VALUES ('Sullust');
INSERT INTO planet (id, name) VALUES ('Toydaria');
INSERT INTO planet (id, name) VALUES ('Malastare');
INSERT INTO planet (id, name) VALUES ('Dathomir');
INSERT INTO planet (id, name) VALUES ('Ryloth');
INSERT INTO planet (id, name) VALUES ('Aleen Minor');
INSERT INTO planet (id, name) VALUES ('Vulpter');
INSERT INTO planet (id, name) VALUES ('Troiken');
INSERT INTO planet (id, name) VALUES ('Tund');
INSERT INTO planet (id, name) VALUES ('Haruun Kal');
INSERT INTO planet (id, name) VALUES ('Cerea');
INSERT INTO planet (id, name) VALUES ('Glee Anselm');
INSERT INTO planet (id, name) VALUES ('Iridonia');
INSERT INTO planet (id, name) VALUES ('Tholoth');
INSERT INTO planet (id, name) VALUES ('Iktotch');
INSERT INTO planet (id, name) VALUES ('Quermia');
INSERT INTO planet (id, name) VALUES ('Dorin');
INSERT INTO planet (id, name) VALUES ('Champala');
INSERT INTO planet (id, name) VALUES ('Mirial');
INSERT INTO planet (id, name) VALUES ('Serenno');
INSERT INTO planet (id, name) VALUES ('Concord Dawn');
INSERT INTO planet (id, name) VALUES ('Zolan');
INSERT INTO planet (id, name) VALUES ('Ojom');
INSERT INTO planet (id, name) VALUES ('Skako');
INSERT INTO planet (id, name) VALUES ('Muunilinst');
INSERT INTO planet (id, name) VALUES ('Shili');
INSERT INTO planet (id, name) VALUES ('Kalee');
INSERT INTO planet (id, name) VALUES ('Umbara');
COMMIT;
-- -- -- INSERT RIDDLES
BEGIN;
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Walks in a zephyr / Stands when its wetter / Counts time, stops clocks / Swallows kingdoms, gnaws rocks', 'sand', 'Tatooine');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('A thousand colored folds stretch toward the sky / Atop a tender strand, rising from the land, til killed by maidens hand / Perhaps a token of love, perhaps to say goodbye', 'flower', 'Alderaan');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Has roots as nobody sees / Is taller than trees / Up, up it goes / And yet never grows', 'mountain', 'Yavin IV');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Dropping down from the sky / More beautiful than rain / There are no two pieces / That ever look the same', 'snow', 'Hoth');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I eat Goblin, Snake and Spider / I eat Giants, Drakes and Walking Bone / I eat Soldier, Hunter, Squire / But simple fish I leave alone', 'water', 'Dagobah');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I fly, yet I have no wings / I roar, yet I have no voice / I cry, yet I have no eyes / I am free, yet I have no choice', 'cloud', 'Bespin');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Can run but never walks / Has a mouth and never talks / Has a head but never weeps / Has a bed but never sleeps', 'river', 'Endor');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I seem shallow, but I am deep / Hidden realms, I doth keep / Lives I take, but food I offer / When pacific, I may chauffeur', 'ocean', 'Naboo');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('What building has the most stories?', 'library', 'Coruscant');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Many-manned scud-thumper / Maker of worn wood, Shrub-ruster / Sky-mocker, Rave! / Portly pusher, Wind-slave', 'ocean', 'Kamino');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('You see me blink, but not my eyes / I wink and wink to fraternize / And if I wink at her just right / Then I may find my love tonight', 'firefly', 'Geonosis');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('It cannot be seen, cannot be felt / Cannot be heard, cannot be smelt / It lies behind stars and under hills / And empty holes it fills / It comes first and follows after / Ends life, kills laughter', 'darkness', 'Utapau');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Where the first appears, I will follow / All things I touch, I try to swallow / Always hungry, always must I be fed / And fingers I lick, will soon turn red', 'fire', 'Mustafar');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Wears rings without fingers, and leaves yet still lingers', 'tree', 'Kashyyyk');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Large as a mountain, small as a pea / Endlessly swimming in a waterless sea', 'asteroid', 'Polis Massa');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Regular patterns are my duty / Many shapes refine my beauty / Small as a pebble, tall as a tree / Lightsabers make use of me', 'crystal', 'Mygeeto');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Is thick but thin as a puff / Is short but tall as a bluff / Brings peace right after the rain / Dazzles us all again and again?', 'rainbow', 'Felucia');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('If you were to kiss one of these / Then your lips you might want to rinse / Although it might be worth trying / In case it turns into a prince', 'frog', 'Cato Neimoidia');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I live as I die / I float as I dry / I wait with bated breath / As the years roll by', 'tree', 'Saleucami');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('In marble halls as white as milk / Lined with skin as soft as silk / No doors there are to this stronghold / Yet thieves break in and steal its gold', 'egg', 'Stewjon');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('It can speak / With its hard metal tongue / But it can not breathe / For it has no lung', 'bell', 'Eriadu');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I am bright but not clever / I burn, but am not an ember / I twinkle, but am not an eye / I seem immortal, but eventually die', 'star', 'Corellia');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I sizzle like bacon, but am made with an egg / I have plenty of backbone, but lack a good leg / I peel layers like onions, but still remain whole / I can be as long as a man, yet fit in a hole', 'snake', 'Rodia');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('If a man carried my burden / He would break his back / I am not rich / But leave silver in my track', 'snail', 'Nal Hutta');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('You will find him on the mountain / You will find him in the creeks / From all tongues emerge a fountain / He has no mouth and yet he speaks', 'echo', 'Dantooine');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Alive as you but without breath / As cold in my life as in my death / Never a thirst though I always drink / Dressed in a mail but never a clink', 'fish', 'Bestine IV');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Thirty white horses / Standing on a red hill / First they stomp / Then they chomp / Then they stand still', 'teeth', 'Ord Mantell');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('A leathery snake / With a stinging bite / I stay coiled up / Unless I must fight', 'whip', 'Trandosha');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Only one color, but not one size / Stuck at the bottom, yet I easily fly / Present in sun, but not in rain / Doing no harm, and feeling no pain', 'shadow', 'Socorro');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('The Moon is my father / The Sea is my mother / I am hard to notice / Among thousands of brothers', 'wave', 'Mon Cala');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I am on land, but on sea / I am an idea, yet can rot / I am two but none / I am and yet am not', 'paradox', 'Chandrila');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('My brothers are gone, but here I stay / For years and years, my debt to repay / Blackened all they left behind / A trail of destruction, easy to find', 'ash', 'Sullust');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('You cannot see, hear or feel, until its to late / What shadows love, and shopkeepers hate', 'theif', 'Toydaria');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I bubble and laugh / And spit water in your face / I am no lady / And I do not wear lace', 'fountain', 'Malastare');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('You can see me, the firstborn of four / You cannot touch me, a sign to not ignore / You can smell me, as I creep under your door / I steal your breath and leave you with no more', 'smoke', 'Dathomir');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Fatherless and Motherless / Born without sin / Roared when it appeared / And never spoke again', 'thunder', 'Ryloth');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Listen closely, I am hard to understand / I am as elusive as is a handful of sand / Even if you perceive me, you know me not / Before you can tell me, what I have forgot', 'riddle', 'Aleen Minor');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Who makes it, has no need of it / Who buys it, has no use for it / Who uses it, can not see it / Who sees it, does not want it', 'coffin', 'Vulpter');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('My sides are firmly laced about / Yet nothing is within / You think my head is strange indeed / Being nothing else but skin', 'drum', 'Troiken');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Hard to catch / Easy to hold / Cannot be seen / Unless it is cold', 'breath', 'Tund');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I fly through the air / On small feathered wings / Seeking out life and / Destroying all things', 'arrow', 'Haruun Kal');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('The rich men want it / The wise men know it / The poor all need it / The kind men show it', 'love', 'Cerea');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Through wind and rain I always play / I roam the earth, yet here I stay / I crumble stones, and fire cannot burn me / Yet I am soft-you can easily pierce me', 'ocean', 'Glee Anselm');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('If you have me, you want to tell me / If you tell me, you do not have me', 'secret', 'Iridonia');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('It comes in on little cat feet / Is neither sour, nor sweet / Hovers in the air / And then is not there', 'fog', 'Tholoth');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Shifting, shifting, drifting deep / Below me great and mighty cities sleep / Swirling, scurlling, all around / I am only where no water will be found', 'desert', 'Iktotch');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Until I am measured / I am not known / Yet how you miss me / When I have flown', 'time', 'Quermia');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Turn us on our backs / And open up our stomachs / You will be the wisest of men / Though at start, a lummox', 'book', 'Dorin');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('A fisherman catches 30 fish in a 5-day fishing competition. Each day he catches 3 more than the last. How many fish did he catch on the first day?', '0', 'Champala');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('As beautiful as the setting sun / As delicate as the morning dew / An angel dusting from the stars / That can turn the land into a frosted moon', 'snow', 'Mirial');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Make me thy lyre, even as the forests are / What if my leaves fell like its own / The tumult of thy mighty harmonies / Will take from both a deep autumnal tone', 'wind', 'Serenno');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I cut through evil like a double edged sword / Balance I single-handedly upraise / Through battles fought with heart and mind / Instead of with my gaze', 'justice', 'Concord Dawn');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('They can be harbored, but few hold water / You can nurse them, but only by holding them against someone else / You can carry them, but not with your arms / You can bury them, but not in the earth', 'grudge', 'Zolan');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Take off my skin, I will not cry / But you will. What Am I?', 'onion', 'Ojom');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I have keys but do not lock / I have space but have no room / You can enter but not come in', 'keyboard', 'Skako');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('I have branches but no trunk, roots or leaves', 'bank', 'Muunilinst');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('What has wings, but can not fly / Is enclosed, but outside can also lie / What is it upon which I doth stand / Which can lead us to many different lands', 'stage', 'Shili');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('Ripped from my mothers womb / Beaten and burned / I become a blood-thirsty slayer', 'iron', 'Kalee');
INSERT INTO riddle (riddle, answer, planet) VALUES 
('My step is slow; snow is my breath / I give the ground a grinding death / My marching makes an end of me / Slain by sun or drowned by sea', 'glacier', 'Umbara');
COMMIT;




