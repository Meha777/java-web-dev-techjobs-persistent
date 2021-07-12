## Part 1: Test it with SQL
Int id;
String employer;
String name;
String skills;
## Part 2: Test it with SQL

SELECT FROM techjobs.employers WHERE location = St.Louis;

## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT skills.id,skills.name, skills.description FROM techjobs.skill
WHERE job.id is not null
ORDER BY ASC;