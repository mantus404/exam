import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';
import { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';

export function ViewService(){
    const [services, setServices] = useState([]);
    const getServices = () => {
        fetch('api/admin/service')
        .then(response => response.json())
        .then(jsonResponse => setServices(jsonResponse));
    };
    useEffect(() => {
        getServices();
    }, []);
    return (<div>
        <div style={{float: 'right', marginRight: '30px'}}><Link to={'/createservice'}>Add Service</Link></div>
        <TableContainer component={Paper}>
      <Table sx={{ minWidth: 650 }} aria-label="simple table">
        <TableHead>
          <TableRow>
            <TableCell>Name</TableCell>
            <TableCell align="right">Address</TableCell>
            <TableCell align="right">Manager</TableCell>
            <TableCell align="right">Edit</TableCell>
            <TableCell align="right">Delete</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {services.map((service) => (
            <TableRow
              key={service.id}
              sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
            >
              <TableCell component="th" scope="row">
                {service.name}
              </TableCell>
              <TableCell align="right">{service.address}</TableCell>
              <TableCell align="right">{service.manager}</TableCell>
              <TableCell align="right"><Link to={'/editservice/' + service.id}>Edit</Link></TableCell>
              <TableCell align="right"><Link to={'/deleteservice/' + service.id}>Delete</Link></TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
    </div>);
}