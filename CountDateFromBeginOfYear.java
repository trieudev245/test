public static void main(String[] args) throws InterruptedException {
        {
            Date yearStartTime = new Date();
            yearStartTime.setHours(0);
            yearStartTime.setMinutes(0);
            yearStartTime.setSeconds(0);

            yearStartTime.setDate(1);      // First day of the month
            yearStartTime.setMonth(0);     // January (the months are indexed from 0 to 11)

            Date currentTime = new Date();
            long msTimeDifference = currentTime.getTime() - yearStartTime.getTime();
            long msDay = 24 * 60 * 60 * 1000;  // The number of milliseconds in 24 hours

            int dayCount = (int) (msTimeDifference/msDay); // The number of full days
            System.out.println("Days since the start of the year: " + dayCount);
        }


    }
