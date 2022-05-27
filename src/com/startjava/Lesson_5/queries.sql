\C 'All the Jaegers'
SELECT * 
FROM jaegers;

\C 'Undestroyed Jaegers'
SELECT *
FROM jaegers 
WHERE jaegers.status = 'Active';

\C 'Mark-1 and Mark-7 Jaegers'
SELECT * 
FROM jaegers 
WHERE mark IN ('Mark-1', 'Mark-7');

\C 'Descending sort of Jaegers by Mark'
SELECT *
FROM jaegers 
ORDER BY mark DESC;


\C 'The Oldest of Jaegers'
SELECT * 
FROM  jaegers 
ORDER BY launch
LIMIT 1;

\C 'The best kaijuKiller Jaeger'
SELECT * 
FROM  jaegers 
ORDER BY kaijuKill DESC
LIMIT 1;

\C 'The weakest kaijuKiller Jaeger'
SELECT * 
FROM  jaegers 
ORDER BY kaijuKill
LIMIT 1;

\C 'Average Jaeger\'s weight'
SELECT AVG(weight)
AS Tons
FROM  jaegers;

\C 'Increase of undestroyed Jaegers Killed kaiju'
UPDATE jaegers
SET  kaijuKill = (kaijuKill + 1)
WHERE status = 'Active';

\C 'Updated Jaegers now'
SELECT * 
FROM jaegers
WHERE status = 'Active';

\C 'Delete destroyed Jaegers'
DELETE  
FROM jaegers
WHERE status = 'Destroyed';

\C 'All the Jaegers now'
SELECT * 
FROM jaegers;