  CREATE TABLE IF NOT EXISTS RATING (
      ID BIGINT GENERATED BY DEFAULT AS IDENTITY,
      RATINGCOUNTER BIGINT,
      RATINGDIVIDER BIGINT,
      TECHNICIAN_ID BIGINT,
      CONSTRAINT RATING_PK PRIMARY KEY (ID)
  );